
//kotlinc HelloWorldMain.kt HelloWorldJNI.kt
//clang -c -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" HelloWorldJNI.c -o HelloWorldJNI.o
//clang -shared -o native.dll HelloWorldJNI.o -Wl
fun main() {
    System.loadLibrary("native")
    HelloWorldJNI().sayHello()
}