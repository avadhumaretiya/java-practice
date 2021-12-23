package dev.practice.collections.listiterator;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        ListIteratorClass listIteratorClass=new ListIteratorClass();

        List list=listIteratorClass.getRandomListWithLimitOf10();
        //Create an object of listIterator and give list of 10 digits
        ListIterator<Integer> iterator=list.listIterator();

        //Iterate ListIterator by while loop
        //ListIterator has two methods for forward and backword parsing
        //hasNaxt() method check that is there any next object available in ListIterator or not
        while(iterator.hasNext()){

            //next() method take next object from iterator
            System.out.println(iterator.next());

        }

        System.out.println();

        //hasPrevious() method check that is there any previous object available in ListIterator or not
        while(iterator.hasPrevious()){

            //next() method take next object from iterator
            System.out.println(iterator.previous());

        }
    }
}
