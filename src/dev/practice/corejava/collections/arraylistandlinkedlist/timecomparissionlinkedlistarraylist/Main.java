package dev.practice.corejava.collections.arraylistandlinkedlist.timecomparissionlinkedlistarraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //Create a arrayList and LinkedList
        ArrayList<Object> arrayList=new ArrayList<>();
        arrayList.add(new Object());
        arrayList.add(new Object());
        arrayList.add(new Object());
        LinkedList<Object> linkedList=new LinkedList<>();
        linkedList.add(new Object());
        linkedList.add(new Object());
        linkedList.add(new Object());

        //Call time checking methods
        TimeComparisionArrayListLinkedList timeComparisionArrayListLinkedList=new TimeComparisionArrayListLinkedList();

        //Here we can check difference in timing
        //Try removing one by one comments and check time
        //Arraylist take very much time to do insert and delete operation intermediately
        timeComparisionArrayListLinkedList.checkTimeTakenByArrayList(arrayList);

        //Linkedlist take couple of milliseconds to insert and delete operation intermediately
        timeComparisionArrayListLinkedList.checkTimeTakenByLinkedList(linkedList);
    }
}
