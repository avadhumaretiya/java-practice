package dev.practice.corejava.collections.removeduplicatefromlist;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromList {

    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        //removeDuplicate(arrayList);
        removeDuplicate1(arrayList);
    }

    public static void removeDuplicate(ArrayList arrayList){

        System.out.println(arrayList);

        //add list into set
        //Where set doesn't allow duplicates
        Set set=new LinkedHashSet();
        set.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(set);

        System.out.println(arrayList);

    }

    public static void removeDuplicate1(ArrayList<Integer> arrayList){

        System.out.println(arrayList);

        ArrayList<Integer> arrayList1=new ArrayList<Integer>();

        for (int i:arrayList) {
            if(!arrayList1.contains(i)){
                arrayList1.add(i);
            }
        }

        arrayList.clear();
        arrayList=arrayList1;
        System.out.println(arrayList);

    }
}
