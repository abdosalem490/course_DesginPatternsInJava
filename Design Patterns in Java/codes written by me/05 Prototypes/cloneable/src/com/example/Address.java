package com.example;

public class Address implements Cloneable{
    public String streetNumber;
    public int houseNumber;

    public Address(String streetNumber, int houseNumber) {
        this.streetNumber = streetNumber;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNumber='" + streetNumber + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }

    // deep copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Address(streetNumber, houseNumber);
    }

}
