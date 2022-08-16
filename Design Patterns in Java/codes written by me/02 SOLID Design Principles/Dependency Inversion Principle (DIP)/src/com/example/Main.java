package com.example;

public class Main {

    /*
    Dependency inversion principle :
    - A. High level modules should not depend on low-level modules
      Both should depend on abstractions
    - B. Abstractions should not depend on details
      Details should depend on abstractions
     */
    public static void main(String[] args) {
        Person john = new Person("John");
        Person child1 =  new Person("Chris");
        Person child2 =  new Person("Matt");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(john, child1);
        relationships.addParentAndChild(john, child2);

        new Research(relationships);


    }
}
