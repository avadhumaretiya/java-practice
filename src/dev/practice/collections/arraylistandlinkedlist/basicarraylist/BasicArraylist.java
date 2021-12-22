package dev.practice.collections.arraylistandlinkedlist.basicarraylist;

import java.util.ArrayList;

public class BasicArraylist {

    public static void main(String[] args) {

        //Create arraylist object
        //Default size of arraylist is 10
        //If we enter 11th object then the size of arraylist automatically increase
        //It is better to use with searching operation //time consuming for insert and delete
        ArrayList list=new ArrayList();

        //Also we can define arraylist with fix size
        ArrayList list1=new ArrayList(15);

        //add method use to add objects in arraylist
        //we can add different types object in same arraylist
        //also we can insert two or more same values
        list.add(new Integer(10));//Wrapperclass object
        list.add(20);//Primitive type
        list.add('c');//Character
        list.add("String");//String

        //add more than 15 objects in arraylist with fixed capacity
        //we don't get an exception here because initializing of capacity is used for increasing speed
        for(int i=0;i<20;i++){
            list1.add(10);
        }

        //print arraylist
        for(int i=0;i<20;i++){
            System.out.println(list1.get(i));
        }
    }
}
