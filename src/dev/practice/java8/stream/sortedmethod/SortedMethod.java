package dev.practice.java8.stream.sortedmethod;

import dev.practice.java8.stream.createlist.CreateList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {

    public static void main(String[] args) {

        ArrayList<String> arrayList= CreateList.createListString();

        //Create stream to get sorted elements
        List list =arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println(list);

        //If need own order then use comparator in sorted argument
        //here -i1.compareTo(i2) means descending order
        List list1=arrayList.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(list1);

        //If need own order then use comparator in sorted argument
        //here i2.compareTo(i1) means reverse order
        List list2=arrayList.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(list2);

    }
}
