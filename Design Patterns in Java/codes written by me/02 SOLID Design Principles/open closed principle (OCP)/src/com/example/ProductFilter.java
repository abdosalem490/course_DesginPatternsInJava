package com.example;

import java.util.List;
import java.util.stream.Stream;


public class ProductFilter {

    // disagrees with Open closed principle
    public Stream<Product> filterByColor(List<Product> products, Color color){
        return products.stream().filter(p-> p.color == color);
    }

    // disagrees with Open closed principle
    public Stream<Product> filterBySize(List<Product> products, Size size){
        return products.stream().filter(p-> p.size == size);
    }

    // disagrees with Open closed principle
    public Stream<Product> filterBySizAndColor(List<Product> products, Size size, Color color){
        return products.stream().filter(p-> p.size == size && p.color == color);
    }
}
