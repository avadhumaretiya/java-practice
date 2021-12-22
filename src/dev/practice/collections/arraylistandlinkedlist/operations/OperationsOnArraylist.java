package dev.practice.collections.arraylistandlinkedlist.operations;

import java.util.ArrayList;
import java.util.List;

public class OperationsOnArraylist {

    public void insertInArraylist(List list) {

        //Enter object on particular location
        list.add(2,100);
        list.add(2,200);
        for(int i=0;i<list.size();i++){
            System.out.print("\t"+list.get(i));
        }
    }

    public void replaceInArrayList(List list){

        //Replace object on particular location
        list.set(1,100);
        list.set(2,200);
        for(int i=0;i<list.size();i++){
            System.out.print("\t"+list.get(i));
        }
    }

    public void addAllMethod(List list){

        List<Integer> list2=new ArrayList<>();
        list2.add(111);
        list2.add(222);
        list2.add(333);

        //add all the objects of list into another list on particular location
        list.addAll(2,list2);

        //also we can append all the objects of list in another list
        //list.addAll(list2);

        for(int i=0;i<list.size();i++){
            System.out.print("\t"+list.get(i));
        }
    }

    public void searchFromList(List list){

        //Create list to search set of elements
        List<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);

        //Search element after checking that available or not
        if(list.contains(20)){
            System.out.println(list.indexOf(20));
        }

        //Search more than one elements from list
        if(list.containsAll(list1)){
            for(int i=0;i<list1.size();i++){
                System.out.println(list.indexOf(list1.get(i)));
            }
        }
    }

    public void removeAnElement(List list){

        //Create list to remove set of elements
        List<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);

        //Remove an object on particular location
        list.remove(3);

        //Remove a set of an object
        list.removeAll(list1);
        for(int i=0;i<list.size();i++){
            System.out.print("\t"+list.get(i));
        }
    }
}
