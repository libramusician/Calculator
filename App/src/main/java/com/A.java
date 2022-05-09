package com;

import java.util.StringTokenizer;

public class A {
    static {
        System.loadLibrary("myLib");
    }
    public native void sayHello();

    public static void main(String[] args) {
        A a = new A();
        a.sayHello();
//        String property = System.getProperty("java.library.path");
//        StringTokenizer parser = new StringTokenizer(property, ";");
//        while (parser.hasMoreTokens()) {
//            System.err.println(parser.nextToken());
//        }
    }
}
