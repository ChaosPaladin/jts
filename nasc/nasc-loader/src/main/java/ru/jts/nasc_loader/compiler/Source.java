package ru.jts.nasc_loader.compiler;

import javax.tools.SimpleJavaFileObject;
import java.net.URI;

/**
 * Created with IntelliJ IDEA.
 * User: camelion
 * Date: 12/18/12
 * Time: 8:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Source extends SimpleJavaFileObject {
    private final String content;

    public Source(String name, String content) {
        super(URI.create("memo:///" + name.replace('.', '/') + Kind.SOURCE.extension), Kind.SOURCE);
        this.content = content;
    }

    @Override
    public CharSequence getCharContent(boolean ignore) {
        return this.content;
    }
}
