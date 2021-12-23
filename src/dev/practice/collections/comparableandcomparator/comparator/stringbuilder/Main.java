package dev.practice.collections.comparableandcomparator.comparator.stringbuilder;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        //create set with reference of Comparator implemented class
        Set<StringBuffer> stringBuffers=new TreeSet<>(new SBComparator());
        stringBuffers.add(new StringBuffer("abc"));
        stringBuffers.add(new StringBuffer("xyz"));
        stringBuffers.add(new StringBuffer("def"));
        stringBuffers.add(new StringBuffer("hij"));

        //Here we get sorted values
        for(StringBuffer sb : stringBuffers){
            System.out.println(sb);
        }

    }
}
