package com.example;

public class Main {

    public static void main(String[] args) throws Exception {
	    Journal j = new Journal();
	    j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "Journal.txt";
        p.saveToFile(j, filename, true);

        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}
