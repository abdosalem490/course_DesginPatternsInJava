package com.example;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text){
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index){
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    // disagrees with single responsibility principle
    public void save(String filename) throws FileNotFoundException{
        try (PrintStream out = new PrintStream(filename)){
            out.println(toString());
        }
    }

    // disagrees with single responsibility principle
    public void load(String filename){

    }

    // disagrees with single responsibility principle
    public void load(URL url){

    }
}
