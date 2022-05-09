#include "com_A.h"   // Generated
#include <stdio.h>
 
// Implementation of the native method sayHello()
JNIEXPORT void JNICALL Java_com_A_sayHello(JNIEnv *env, jobject thisObj) {
   printf("Hello World!\n");
   return;
}