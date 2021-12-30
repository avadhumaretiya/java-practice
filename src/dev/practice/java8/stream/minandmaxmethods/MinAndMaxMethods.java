package dev.practice.java8.stream.minandmaxmethods;

import dev.practice.java8.stream.createlist.CreateList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MinAndMaxMethods {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList= CreateList.createList();

        //Create stream to get minimum and maximum values
        int min =arrayList.stream().min((i1,i2)->i1.compareTo(i2)).get();

        System.out.println(min);

        //Create stream to get maximum and maximum values
        int max =arrayList.stream().max((i1,i2)->i1.compareTo(i2)).get();

        System.out.println(max);
    }
}
