package dev.practice.corejava.collections.collectionsort;

import java.util.Comparator;

public class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        return t1.compareTo(s);
    }
}
