package com.example;

public class OldFashionedPrinter implements Machine {
    @Override
    public void print(Document d) {
        //
    }

    // old printer don't know how to implement it so it violates
    @Override
    public void fax(Document d) {
        //
    }

    // old printer don't know how to implement it so it violates
    @Override
    public void scan(Document d) {
        //
    }
}
