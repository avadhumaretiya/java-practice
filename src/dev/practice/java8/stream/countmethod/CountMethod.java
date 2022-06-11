package dev.practice.java8.stream.countmethod;

import dev.practice.java8.stream.createlist.CreateList;

import java.util.ArrayList;

public class CountMethod {

    public static void main(String[] args) {

        ArrayList<String> arrayList= CreateList.createListString();

        //Create stream to get count of hoe many elements in filtered list
        long count=arrayList.stream().filter(s->s.length()<=5).count();

        System.out.println(count);
    }
}
