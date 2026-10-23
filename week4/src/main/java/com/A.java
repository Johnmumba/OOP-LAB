package com;

import com.zut.Probe;

public class A {
    public void printStuff() {
        Probe p = new Probe();
        // System.out.println("Default: " + p._default);
        // System.out.println("Protected: " + p._protected);
        System.out.println("Public: " + p._public);
        System.out.println("Private: " + p.getPrivate());
    }
}
