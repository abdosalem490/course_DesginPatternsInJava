package com.example;

public class Square extends Rectangle{

    public Square() {
    }

    public Square(int size){
        width = height = size;
    }

    // violates Liskov principle
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    // violates Liskov principle
    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
