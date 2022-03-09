package com.learn.designpatterns.solid.srp;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        Journal journal = new Journal();
        journal.addEntries("A cried today.");
        journal.addEntries("I ate a bug today");
        System.out.println(journal);

        Persistence p = new Persistence();
        String fileName = "c:\\temp\\journal.txt";
        p.saveToFile(journal, fileName, true);

        Runtime.getRuntime().exec("notepad.exe " + fileName);
    }
}
