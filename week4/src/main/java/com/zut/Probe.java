package com.zut;

public class Probe {
    int _default = 1;
    protected int _protected = 2;
    public int _public = 3;
    private int _private = 4;

    public Probe() {
        System.out.print("Private: " + _private);
    }

    public int getPrivate() {
        return this._private;
    }
}
