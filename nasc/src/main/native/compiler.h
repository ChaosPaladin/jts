#ifndef COMPILER_H_
#define COMPILER_H_

#include <jni.h>
#include <string>

int compile(const char* fileName, JNIEnv * _env, jobject _obj, jmethodID _mid);

void addSource(std::string *fName, std::string *source);

#endif /* COMPILER_H_ */