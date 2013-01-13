#include <fstream>

#include "compiler.h"
#include "scaner.h"

using namespace std;

JNIEnv *env;
jobject obj;
jmethodID mid;

int compile(const char* fileName, JNIEnv * _env, jobject _obj, jmethodID _mid) {
    env = _env;
    obj = _obj;
    mid = _mid;

    code_driver driver;

    return driver.parse(fileName);
}

void addSource(string *fName, string *source) {
    env->CallVoidMethod(obj, mid, env->NewStringUTF(fName->c_str()), env->NewStringUTF(source->c_str()));
}