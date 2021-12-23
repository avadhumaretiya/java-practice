package dev.practice.collections.setintroduction.setwithtreeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetCheck {

    public static void main(String[] args) {

        //Create set object
        Set<Integer> value=new TreeSet<>();

        //try to add duplicate values
        //But set cannot accept duplicate values
        //Stringbuffer not accepted in treeSet without comparable in previous versions of java
        value.add(4);
        value.add(3);
        value.add(2);
        value.add(1);
        value.add(3);
        value.add(2);
        value.add(4);
        value.add(1);

        //So here we get only 4 values (1,2,3,4) from 8 values (1,2,3,4,1,2,3,4)
        //TreeSet gives values in ascending order by default
        for(int i:value){
            System.out.println(i);
        }
    }
}
