package com.learn.designpatterns.solid.srp;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private static int count = 0;
    private final List<String> entries = new ArrayList<>();

    public void addEntries(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }


    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
