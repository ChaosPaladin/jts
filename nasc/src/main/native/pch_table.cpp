#include <iostream>
#include <map>
#include <string>
#include "pch_table.h"
#include "pch_util.h"

using namespace std;

map<string, string> manual_table = map<string, string>();
map<string, string> skill_table = map<string, string>();
map<string, string> item_table = map<string, string>();
map<string, string> instantzonedata_table = map<string, string>();
map<string, string> multisell_table = map<string, string>();
map<string, string> category_table = map<string, string>();
map<string, string> quest_table = map<string, string>();
map<string, string> npc_table = map<string, string>();
map<string, string> castledata_table = map<string, string>();

// add skill link
JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_SkillPchLinker_addLink(JNIEnv * env, jobject obj, jstring jlink, jstring jvalue) {
    jboolean isCopy1;
    jboolean isCopy2;

    const char* tempLink = env->GetStringUTFChars(jlink, &isCopy1);
    const char* tempValue = env->GetStringUTFChars(jvalue, &isCopy2);

    string link;
    string value;

    link += tempLink;
    value += tempValue;

    skill_table.insert(pair<string, string>(link, value));

    if(isCopy1 == JNI_TRUE)
        env->ReleaseStringUTFChars(jlink, tempLink);
    if(isCopy2 == JNI_TRUE)
        env->ReleaseStringUTFChars(jvalue, tempValue);
}

// unload skill table
JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_SkillPchLinker_unload_1native(JNIEnv * env, jobject obj) {
    skill_table.clear();
}

// add item link
JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_ItemPchLinker_addLink(JNIEnv * env, jobject obj, jstring jlink, jstring jvalue) {
    jboolean isCopy1;
    jboolean isCopy2;

    const char* tempLink = env->GetStringUTFChars(jlink, &isCopy1);
    const char* tempValue = env->GetStringUTFChars(jvalue, &isCopy2);

    string link;
    string value;

    link += tempLink;
    value += tempValue;

    item_table.insert(pair<string, string>(link, value));

    if(isCopy1 == JNI_TRUE)
        env->ReleaseStringUTFChars(jlink, tempLink);
    if(isCopy2 == JNI_TRUE)
        env->ReleaseStringUTFChars(jvalue, tempValue);
}

// unload item table
JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_ItemlPchLinker_unload_1native(JNIEnv * env, jobject obj) {
    item_table.clear();
}

// add manual link
JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_ManualPchLinker_addLink(JNIEnv * env, jobject obj, jstring jlink, jstring jvalue) {
    jboolean isCopy1;
    jboolean isCopy2;

    const char* tempLink = env->GetStringUTFChars(jlink, &isCopy1);
    const char* tempValue = env->GetStringUTFChars(jvalue, &isCopy2);

    string link;
    string value;

    link += tempLink;
    value += tempValue;

    manual_table.insert(pair<string, string>(link, value));

    if(isCopy1 == JNI_TRUE)
        env->ReleaseStringUTFChars(jlink, tempLink);
    if(isCopy2 == JNI_TRUE)
        env->ReleaseStringUTFChars(jvalue, tempValue);
}

// unload manual table
JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_ManualPchLinker_unload_1native(JNIEnv * env, jobject obj) {
    manual_table.clear();
}

// add multisell link
JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_MultisellPchLinker_addLink(JNIEnv * env, jobject obj, jstring jlink, jstring jvalue) {
    jboolean isCopy1;
    jboolean isCopy2;

    const char* tempLink = env->GetStringUTFChars(jlink, &isCopy1);
    const char* tempValue = env->GetStringUTFChars(jvalue, &isCopy2);

    string link;
    string value;

    link += tempLink;
    value += tempValue;

    multisell_table.insert(pair<string, string>(link, value));

    if(isCopy1 == JNI_TRUE)
        env->ReleaseStringUTFChars(jlink, tempLink);
    if(isCopy2 == JNI_TRUE)
        env->ReleaseStringUTFChars(jvalue, tempValue);
}

// unload multisell table
JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_MultisellPchLinker_unload_1native(JNIEnv * env, jobject obj) {
    multisell_table.clear();
}

// add category link
JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_CategoryPchLinker_addLink(JNIEnv * env, jobject obj, jstring jlink, jstring jvalue) {
    jboolean isCopy1;
    jboolean isCopy2;

    const char* tempLink = env->GetStringUTFChars(jlink, &isCopy1);
    const char* tempValue = env->GetStringUTFChars(jvalue, &isCopy2);

    string link;
    string value;

    link += tempLink;
    value += tempValue;

    category_table.insert(pair<string, string>(link, value));

    if(isCopy1 == JNI_TRUE)
        env->ReleaseStringUTFChars(jlink, tempLink);
    if(isCopy2 == JNI_TRUE)
        env->ReleaseStringUTFChars(jvalue, tempValue);
}

JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_CategoryPchLinker_unload_1native(JNIEnv * env, jobject obj) {
    category_table.clear();
}

// add quest link
JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_QuestPchLinker_addLink(JNIEnv * env, jobject obj, jstring jlink, jstring jvalue) {
    jboolean isCopy1;
    jboolean isCopy2;

    const char* tempLink = env->GetStringUTFChars(jlink, &isCopy1);
    const char* tempValue = env->GetStringUTFChars(jvalue, &isCopy2);

    string link;
    string value;

    link += tempLink;
    value += tempValue;

    quest_table.insert(pair<string, string>(link, value));

    if(isCopy1 == JNI_TRUE)
        env->ReleaseStringUTFChars(jlink, tempLink);
    if(isCopy2 == JNI_TRUE)
        env->ReleaseStringUTFChars(jvalue, tempValue);
}

// unload quest table
JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_QuestPchLinker_unload_1native(JNIEnv * env, jobject obj) {
    quest_table.clear();
}

JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_NpcPchLinker_addLink(JNIEnv * env, jobject obj, jstring jlink, jstring jvalue) {
    jboolean isCopy1;
    jboolean isCopy2;

    const char* tempLink = env->GetStringUTFChars(jlink, &isCopy1);
    const char* tempValue = env->GetStringUTFChars(jvalue, &isCopy2);

    string link;
    string value;

    link += tempLink;
    value += tempValue;

    npc_table.insert(pair<string, string>(link, value));

    if(isCopy1 == JNI_TRUE)
        env->ReleaseStringUTFChars(jlink, tempLink);
    if(isCopy2 == JNI_TRUE)
        env->ReleaseStringUTFChars(jvalue, tempValue);
}

// unload npc table
JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_NpcPchLinker_unload_1native(JNIEnv * env, jobject obj) {
    npc_table.clear();
}

// add castledata link
JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_CastledataPchLinker_addLink(JNIEnv * env, jobject obj, jstring jlink, jstring jvalue) {
    jboolean isCopy1;
    jboolean isCopy2;

    const char* tempLink = env->GetStringUTFChars(jlink, &isCopy1);
    const char* tempValue = env->GetStringUTFChars(jvalue, &isCopy2);

    string link;
    string value;

    link += tempLink;
    value += tempValue;

    castledata_table.insert(pair<string, string>(link, value));

    if(isCopy1 == JNI_TRUE)
        env->ReleaseStringUTFChars(jlink, tempLink);
    if(isCopy2 == JNI_TRUE)
        env->ReleaseStringUTFChars(jvalue, tempValue);
}

// unload castledata table
JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_CastledataPchLinker_unload_1native(JNIEnv * env, jobject obj){
    castledata_table.clear();
}

// add link to instantzonedata table
JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_InstantzoneDataPchLinker_addLink(JNIEnv * env, jobject obj, jstring jlink, jstring jvalue) {
    jboolean isCopy1;
    jboolean isCopy2;

    const char* tempLink = env->GetStringUTFChars(jlink, &isCopy1);
    const char* tempValue = env->GetStringUTFChars(jvalue, &isCopy2);

    string link;
    string value;

    link += tempLink;
    value += tempValue;

    instantzonedata_table.insert(pair<string, string>(link, value));

    if(isCopy1 == JNI_TRUE)
        env->ReleaseStringUTFChars(jlink, tempLink);
    if(isCopy2 == JNI_TRUE)
        env->ReleaseStringUTFChars(jvalue, tempValue);
}

// unload instantzonedata table
JNIEXPORT void JNICALL Java_ru_jts_nasc_1loader_pch_linker_InstantzoneDataPchLinker_unload_1native(JNIEnv * env, jobject obj){
    instantzonedata_table.clear();
}

// find value for link
JNIEXPORT jstring JNICALL Java_ru_jts_nasc_1loader_pch_LinkerFactory_findValueFor(JNIEnv * env, jobject obj, jstring jlink) {
    jboolean isCopy;

    const char* tempLink = env->GetStringUTFChars(jlink, &isCopy);

    string link;

    link += tempLink;

    string* value = get_value_for(link);

    jstring jvalue = env->NewStringUTF(value->c_str());

    delete value;

    return jvalue;
}

// creates copy of value
string* get_value_for(string link) {
    if (manual_table.find(link) != manual_table.end()) {  // manual table
        return new string(manual_table.find(link)->second);
    }
    if (skill_table.find(link) != skill_table.end()) { // skill table
        return new string(skill_table.find(link)->second);
    }
    if (item_table.find(link) != item_table.end()) { // item table
        return new string(item_table.find(link)->second);
    }
    if (instantzonedata_table.find(link) != instantzonedata_table.end()) { // item table
        return new string(instantzonedata_table.find(link)->second);
    }
    if (multisell_table.find(link) != multisell_table.end()) { // multisell table
        return new string(multisell_table.find(link)->second);
    }
    if (category_table.find(link) != category_table.end()) { // category table
        return new string(category_table.find(link)->second);
    }
    if (quest_table.find(link) != quest_table.end()) { // quest table
        return new string(quest_table.find(link)->second);
    }
    if (npc_table.find(link) != npc_table.end()) { // npc table
        return new string(npc_table.find(link)->second);
    }
    if (castledata_table.find(link) != castledata_table.end()) { // npc table
        return new string(castledata_table.find(link)->second);
    }
    cerr << "Not found link "  << link << flush << endl;
    return new string("");
}