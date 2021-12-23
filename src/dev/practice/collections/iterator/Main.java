package dev.practice.collections.iterator;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        IteratorInterface iteratorInterface=new IteratorInterface();

        List list=iteratorInterface.getRandomListWithLimitOf10();
        //Create an object of iterator and give list of 10 digits
        Iterator<Integer> iterator=list.iterator();

        //Iterate Iterator by while loop
        //hasNaxt() method check that is there any next object available in iterator or not
        while(iterator.hasNext()){

            //next() method take next object from iterator
            System.out.println(iterator.next());

        }

        //remove() method use to remove objects from iterator
        //This will remove last object from the iterator
        iterator.remove();
        System.out.println(list);
    }
}
