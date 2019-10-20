#include <stdio.h>
#include "HelloWorldJNI.h"

JNIEXPORT void JNICALL Java_HelloWorldJNI_sayHello
  (JNIEnv * env, jobject obj){
  printf("OOGA BOOGA");
}
