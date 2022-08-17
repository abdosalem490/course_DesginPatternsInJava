package com.example;

public class Main {

    public static void main(String[] args) {
	    PersonBuilder pb = new PersonBuilder();
	    Person person = pb.lives().at("123 london Road").in("london").withPostcode("SW12BC")
                .works().at("Fabrikam").asA("Engineer").earning(123000).build();
        System.out.println(person);
    }
}
