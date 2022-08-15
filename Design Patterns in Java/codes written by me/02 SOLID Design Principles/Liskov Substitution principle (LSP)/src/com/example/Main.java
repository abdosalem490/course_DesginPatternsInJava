package com.example;

public class Main {

    static void useIt(Rectangle r){
        int width = r.getWidth();
        r.setHeight(10);
        //area = width * 10
        System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
    }

    public static void main(String[] args) {

	    Rectangle rc = new Rectangle(2, 3);
	    useIt(rc);

	    Rectangle sq = new Square();
	    sq.setWidth(5);
	    useIt(sq);
    }
}
