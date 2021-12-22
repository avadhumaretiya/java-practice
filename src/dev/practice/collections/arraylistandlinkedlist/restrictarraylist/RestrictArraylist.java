package dev.practice.collections.arraylistandlinkedlist.restrictarraylist;

import java.util.ArrayList;

public class RestrictArraylist {

    public static void main(String[] args) {

        //With use of triangular bracket with return type we can restrict arraylist to enter other datatype data
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(new Integer(2));
        //Here we try to enter String data in Integer type arraylist but it is not allow to enter the data
        //arrayList.add("String");
    }
}
