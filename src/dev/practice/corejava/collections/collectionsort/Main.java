package dev.practice.corejava.collections.collectionsort;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SortingList sortingList=new SortingList();
        List<String> list=sortingList.createList();
        System.out.println("Before Sorting: "+list);

        //By suing Collections.sort
        Collections.sort(list);
        System.out.println("After Sorting: "+list);

        //by using custom comparator with reversing manner
        Collections.sort(list,new CustomComparator());
        System.out.println("After Sorting: "+list);
    }
}
