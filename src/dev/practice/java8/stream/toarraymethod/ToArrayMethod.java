package dev.practice.java8.stream.toarraymethod;

import dev.practice.java8.stream.createlist.CreateList;

import java.util.ArrayList;

public class ToArrayMethod {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList= CreateList.createList();

        //Use toArray method to copy elements of list into array
        Integer[] array=arrayList.stream().toArray(Integer[] :: new);

        //Print every elements of an array
        for(Integer integer:array) {
            System.out.println(integer);
        }
    }
}
