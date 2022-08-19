package com.example;

public class CoffeeFactory implements HotDrinkFactory{
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Grind some beans, boil water, pour " + amount + " ml, add cream and sugar , enjoy !");
        return new Cofee();
    }
}
