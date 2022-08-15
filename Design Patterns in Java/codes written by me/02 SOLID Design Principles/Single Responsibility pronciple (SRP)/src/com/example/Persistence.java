package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {
    // agrees with single responsibility principle
    public void saveToFile(Journal journal, String filename, boolean overwrite) throws FileNotFoundException {
        if (overwrite || new File(filename).exists()){
            try (PrintStream out = new PrintStream(filename)){
                out.println(journal.toString());
            }
        }
    }

    // agrees with single responsibility principle
    public Journal load(String filename){
        return null;
    }

    // agrees with single responsibility principle
    public Journal load(URL url){
        return null;
    }
}
