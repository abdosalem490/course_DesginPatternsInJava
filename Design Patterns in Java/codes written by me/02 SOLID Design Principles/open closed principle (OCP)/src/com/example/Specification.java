package com.example;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
