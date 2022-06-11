package dev.practice.java8.stream.createlist;

import java.util.ArrayList;

public class CreateList {

    public static ArrayList<Integer> createList(){
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);
        arrayList.add(25);
        return arrayList;
    }

    public static ArrayList<String> createListString(){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("avadh");
        arrayList.add("umaretiya");
        arrayList.add("athens");
        return arrayList;
    }
}
