package com.example;

public class TeaFactory implements HotDrinkFactory{

    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Putting in tea bag, biol water , pour " + amount + " ml, add lemon , enjoy!");
        return new Tea();
    }
}
