package dev.practice.java8.stream.foreachmethod;

import dev.practice.java8.stream.createlist.CreateList;

import java.util.ArrayList;

public class ForEachMethod {

    public static void main(String[] args) {

        ArrayList<String> arrayList= CreateList.createListString();

        //forEach() method to print every elements in arraylist
        //this can take lambda expression as an argument
        arrayList.stream().forEach(s -> System.out.println(s));

        //also we can use method reference
        arrayList.stream().forEach(System.out::println);
    }
}
