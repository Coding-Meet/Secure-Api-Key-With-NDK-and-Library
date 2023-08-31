#include <jni.h>


extern "C"
JNIEXPORT jstring JNICALL
Java_com_coding_meet_secureapikeywithndkotherlibrary_MainActivity_00024Keys_encryptString(
        JNIEnv *env, jobject thiz) {
    return env ->NewStringUTF("AAEBQAwAAAAQAAAAHgAAAGAjUeM37mcAHKoul6BenIxfm/QXrVdn/tUW3Eb2BCEA87kDKsYFZAVD3ZeIGjXCaZausUTSJMHWKO4=");  /* Here Api key*/
}
extern "C"
JNIEXPORT jstring JNICALL
Java_com_coding_meet_secureapikeywithndkotherlibrary_MainActivity_00024Keys_key(JNIEnv *env,
                                                                                jobject thiz) {
    return env ->NewStringUTF("LcYPI8pffXE3p9xrPf4uNOz4vuMhWqOwyTWqmqij36mWWdcaGYVxFRrP8PAA8H9d");  /* Here  key*/

}