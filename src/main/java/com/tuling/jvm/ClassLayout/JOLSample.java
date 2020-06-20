package com.tuling.jvm.ClassLayout;

import org.openjdk.jol.info.ClassLayout;

public class JOLSample {
    public static void main(String[] args) {
        ClassLayout layout = ClassLayout.parseInstance(new Object());
        System.out.println(layout.toPrintable());
    }
}
