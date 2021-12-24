package dev.practice.corejava.collections.binarysearch;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SearchingFromList sortingList=new SearchingFromList();
        List<String> list=sortingList.createList();
        System.out.println("Before Sorting: "+list);

        //List should be sorted before searching with binary search
        //Here we are not using sorted list
        //So it gives wrong location or index of an element
        System.out.println("Index of an element: "+Collections.binarySearch(list,"7span"));

        //Sort the list then apply binarysearch
        Collections.sort(list);
        System.out.println("Index of an element: "+Collections.binarySearch(list,"7span"));
    }
}
