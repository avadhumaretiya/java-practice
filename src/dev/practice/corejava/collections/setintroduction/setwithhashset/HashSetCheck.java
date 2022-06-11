package dev.practice.corejava.collections.setintroduction.setwithhashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetCheck {

    public static void main(String[] args) {

        //Create set object
        Set<Integer> value=new HashSet<>();

        //try to add duplicate values
        //But set cannot accept duplicate values
        value.add(1);
        value.add(2);
        value.add(3);
        value.add(4);
        value.add(1);
        value.add(2);
        value.add(3);
        value.add(4);

        //So here we get only 4 values (1,2,3,4) from 8 values (1,2,3,4,1,2,3,4)
        for(int i:value){
            System.out.println(i);
        }
    }
}
