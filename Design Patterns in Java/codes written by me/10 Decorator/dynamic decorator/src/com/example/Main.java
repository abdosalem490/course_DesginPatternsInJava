package com.example;

public class Main {

    public static void main(String[] args) {
	    Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColorShape blueSquare = new ColorShape(new Square(20), "blue");
        System.out.println(blueSquare.info());

        TransparentShape transparentShape = new TransparentShape(new ColorShape(new Circle(50), "green"), 50);
        System.out.println(transparentShape.info());
    }
}
