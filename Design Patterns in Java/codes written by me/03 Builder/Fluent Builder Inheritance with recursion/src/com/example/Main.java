package com.example;

public class Main {

    public static void main(String[] args) {
	    EmployeeBuilder pb = new EmployeeBuilder();
	    Person dmitri = pb.withName("Dmitri").worksAt("Developer").build();
        System.out.println(dmitri);
    }
}
