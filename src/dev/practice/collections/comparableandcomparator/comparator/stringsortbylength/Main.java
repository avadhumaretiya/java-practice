package dev.practice.collections.comparableandcomparator.comparator.stringsortbylength;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        //create set with reference of Comparator implemented class
        Set<String> stringBuffers=new TreeSet<String>(new StringSortByLength());
        stringBuffers.add(("abc"));
        stringBuffers.add(("hijabcdefghijk"));
        stringBuffers.add(("defabcde"));
        stringBuffers.add(("xyz23"));

        //Here we get sorted values by length
        for(String sb : stringBuffers){
            System.out.println(sb);
        }

    }
}
