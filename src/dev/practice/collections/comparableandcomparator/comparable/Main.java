package dev.practice.collections.comparableandcomparator.comparable;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<CompareObjects> stringBuffers=new TreeSet<>();
        stringBuffers.add(new CompareObjects(100,"avadh"));
        stringBuffers.add(new CompareObjects(400,"7span"));
        stringBuffers.add(new CompareObjects(200,"blackmoon"));
        stringBuffers.add(new CompareObjects(500,"span"));

        //This will sort by id
        for (CompareObjects s: stringBuffers) {
            System.out.println(s.id);
            System.out.println(s.name);
        }
    }
}
