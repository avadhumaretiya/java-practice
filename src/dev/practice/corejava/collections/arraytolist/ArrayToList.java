package dev.practice.corejava.collections.arraytolist;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args) {

        String[] strings={"avadh","7span","&span","umretiya"};
        //This will convert array into list
        List list= Arrays.asList(strings);
        System.out.println(list);
    }
}
