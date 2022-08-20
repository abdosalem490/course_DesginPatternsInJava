package com.example;

public class Main {

    // cloneable isn't preferred in deep copy
    public static void main(String[] args) throws Exception{
	    Person john = new Person(new String[] {"John", "Smith"}, new Address("London Road", 123));

	    Person jane = (Person) john.clone();
	    jane.names[0] = "Jane";
	    jane.address.houseNumber = 124;

        System.out.println(john);
        System.out.println(jane);


    }
}
