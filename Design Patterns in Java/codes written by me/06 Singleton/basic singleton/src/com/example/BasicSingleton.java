package com.example;

import java.io.Serializable;

public class BasicSingleton implements Serializable {

    private static final BasicSingleton INSTANCE = new BasicSingleton();
    private int value = 0;

    private BasicSingleton(){

    }

    public static BasicSingleton getInstance(){
        return INSTANCE;
    }

    public static BasicSingleton getINSTANCE() {
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // used with singleton while reading from stream
    protected Object readResolve(){
        return INSTANCE;
    }

}
