package com.example;

import java.util.HashMap;

public class Printer {
    private static int instanceCount  = 0;
    private static HashMap<Subsystem, Printer> instances = new HashMap<>();

    private Printer(){
        instanceCount++;
        System.out.println("A total of " + instanceCount + " instances created so far");
    }

    public static Printer get(Subsystem ss){
        if (instances.containsKey(ss))
            return instances.get(ss);

        Printer instance = new Printer();
        instances.put(ss, instance);
        return instance;
    }
}
