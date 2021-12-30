package dev.practice.java8.stream.findstringbysize;

import dev.practice.java8.stream.createlist.CreateList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringBySize {

    public static void main(String[] args) {

        ArrayList<String> arrayList= CreateList.createListString();

        //Create stream to find string by string length
        List list =arrayList.stream().filter(s->s.length()<=5).collect(Collectors.toList());

        System.out.println(list);

    }
}
