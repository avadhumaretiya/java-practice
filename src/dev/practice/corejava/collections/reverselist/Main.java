package dev.practice.corejava.collections.reverselist;

import dev.practice.corejava.collections.collectionsort.SortingList;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SortingList sortingList=new SortingList();
        List list=sortingList.createList();
        //This reverse the given list
        Collections.reverse(list);
        System.out.println(list);
    }
}
