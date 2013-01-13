#include <iostream>

#include "compiler.h"
#include "nasc_loader.h"

JNIEXPORT jint JNICALL Java_ru_jts_nasc_1loader_NASCLoader_compileNative
  (JNIEnv *env, jobject obj, jstring jFileName)
{
    // Ссылка на класс NASCLoader
    jclass cls = env->GetObjectClass(obj);
    // Ссылка на метод NASCLoader#addSource
    jmethodID mid = env->GetMethodID(cls, "addSource", "(Ljava/lang/String;Ljava/lang/String;)V");

    // nasc - исходник
    const char *fName = env->GetStringUTFChars(jFileName, 0);
    //printf("Native: ai file name=%s\n", str);

    // Compile file
    int code = compile(fName, env, obj, mid);

    env->ReleaseStringUTFChars(jFileName, fName);

    return code;
}