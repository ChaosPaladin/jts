package ru.jts.nasc_loader;

import org.eclipse.jdt.internal.compiler.apt.util.EclipseFileManager;
import ru.jts.common.log.Log;
import ru.jts.nasc_loader.compiler.MemoryClassLoader;
import ru.jts.nasc_loader.compiler.MemoryJavaFileManager;
import ru.jts.nasc_loader.compiler.Source;
import ru.jts.nasc_loader.pch.LinkerFactory;

import javax.tools.*;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * @author Дмитрий
 * @date 02.12.12  9:29
 */
public class NASCLoader {

    static {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win"))
            System.loadLibrary("win");
        else if (osName.contains("linux"))
            System.loadLibrary("unix");
    }

    private static NASCLoader ourInstance = new NASCLoader();
    private List<Source> sources;

    private MemoryClassLoader memClassLoader;

    private NASCLoader() {
        sources = new ArrayList<>();
        memClassLoader = new MemoryClassLoader();
    }

    public static NASCLoader getInstance() {
        return ourInstance;
    }

    public void load(String fileName) throws Exception {
        LinkerFactory.getInstance();
        int code = compileNative(fileName);

        if (code == 0) { // Successfully compile
            //JavaCompiler javac = new EclipseCompiler();
            JavaCompiler javac = ToolProvider.getSystemJavaCompiler();
            DiagnosticListener<JavaFileObject> listener = new DefaultDiagnosticListener();
            StandardJavaFileManager fileManager = new EclipseFileManager(Locale.getDefault(), Charset.defaultCharset());
            MemoryJavaFileManager memFileManager = new MemoryJavaFileManager(javac.getStandardFileManager(null, null, null), memClassLoader);

            // javac options
            List<String> options = new ArrayList<>();
            //options.add("-Xlint:all");
            //options.add("-warn:none");
            //options.add("-g");
            //options.add("-1.7");

            Writer writer = new StringWriter();
            JavaCompiler.CompilationTask compile = javac.getTask(writer, memFileManager, listener, options, null, sources);

            if (compile.call()) {
                Log.i("Success java-part scripts compilation. Compiled scripts count is " + sources.size());
            } else {
                throw new Exception("Error in java-parts scripts compilation:");
            }
        } else {
            throw new Exception("Compilation ended with code " + code);
        }

        // clear all sources
        sources.clear();
    }

    public ClassLoader getClassLoader() {
        return memClassLoader;
    }

    private native int compileNative(String fileName);

    /**
     * Called from JNI *
     */
    public void addSource(String fileName, String content) {

        sources.add(new Source(fileName, content));

        File file = new File("data/generated/" + fileName + ".java");
        if (file.exists())
            file.delete();
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            fw.write(content);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        if(sources.size() % 100 == 0) {
            System.out.println("Generated " + sources.size() + " ai's");
        }

        //System.out.println("source:");
        //System.out.println(source);
    }

    private class DefaultDiagnosticListener implements DiagnosticListener<JavaFileObject> {
        @Override
        public void report(Diagnostic<? extends JavaFileObject> diagnostic) {
            Diagnostic.Kind kind = diagnostic.getKind();
            if (kind != Diagnostic.Kind.ERROR)
                Log.d(diagnostic.getSource().getName() + (diagnostic.getPosition() == Diagnostic.NOPOS ? "" : ":" + diagnostic.getLineNumber() + "," + diagnostic.getColumnNumber()) + ": "
                        + diagnostic.getMessage(Locale.getDefault()));
            else
                Log.e(diagnostic.getSource().getName() + (diagnostic.getPosition() == Diagnostic.NOPOS ? "" : ":" + diagnostic.getLineNumber() + "," + diagnostic.getColumnNumber()) + ": "
                        + diagnostic.getMessage(Locale.getDefault()));
        }
    }
}
