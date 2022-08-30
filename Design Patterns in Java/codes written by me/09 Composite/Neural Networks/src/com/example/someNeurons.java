package com.example;

public interface someNeurons extends Iterable<Neuron>{
    default void connectTo(someNeurons other){
        if (this == other) return;

        for (Neuron from : this){
            for (Neuron to : other){
                from.out.add(to);
                to.in.add(from);
            }
        }
    }
}
