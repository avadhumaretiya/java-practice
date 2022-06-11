package dev.practice.java8.stream.basicstream;

import dev.practice.java8.stream.createlist.CreateList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicStream {

    public static void main(String[] args) {

        //create an arraylist with integer values
        ArrayList<Integer> arrayList= CreateList.createList();
        System.out.println(arrayList);

        //Find list of even number with use of stream
        //filter use to apply condition // also we can use predicate in filter argument
        //filter use to search elements from list based on conditions
        //collect use to return list //also we can use supplier in collect argument
        List list= arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list);
    }
}
