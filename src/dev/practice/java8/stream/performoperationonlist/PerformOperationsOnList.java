package dev.practice.java8.stream.performoperationonlist;

import dev.practice.java8.stream.createlist.CreateList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PerformOperationsOnList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList= CreateList.createList();

        //Perform operations on list
        //map() use to perform operation on list//we can use Function in argument of map()
        //here we double the value of every elements in list
        List list=arrayList.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(list);
    }
}
