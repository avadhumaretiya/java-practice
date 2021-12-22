package dev.practice.collections.arraylistandlinkedlist.timecomparissionlinkedlistarraylist;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;

public class TimeComparisionArrayListLinkedList {

    public void checkTimeTakenByArrayList(ArrayList arrayList){
        //Check start time
        long start=System.currentTimeMillis();

        //Insert objects in arraylist
        for (int i=0;i<1000000;i++) {
            //Insert objects into arraylist
            arrayList.add(2,new Object());
        }
        //Check stop time
        long stop=System.currentTimeMillis();
        System.out.println(stop-start);
    }

    public void checkTimeTakenByLinkedList(LinkedList linkedList){
        //Check start time
        long start=System.currentTimeMillis();

        //Insert objects in arraylist
        for (int i=0;i<1000000;i++) {
            //Insert objects into arraylist
            linkedList.add(2,new Object());
        }
        //Check stop time
        long stop=System.currentTimeMillis();
        System.out.println(stop-start);
    }
}
