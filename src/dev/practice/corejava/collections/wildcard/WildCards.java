package dev.practice.corejava.collections.wildcard;

import dev.practice.corejava.collections.customrgenericwithrestriction.CanExtendOwn;

import java.util.ArrayList;

public class WildCards {

    public static void main(String[] args) {

        WildCards wildCards=new WildCards();
        //Here we can pass Arraylist with thread or any other type which extends thread
        wildCards.wildcardMethod(new ArrayList<Thread>());
        wildCards.wildcardMethod(new ArrayList<CanExtendOwn>());
        //but we cannot add other types in argument
        wildCards.wildcardMethod(new ArrayList<>());
    }

    public void  wildcardMethod(ArrayList<? extends Thread> arrayList){

        //here we can only add null value
        //here we extends Thread but still not able to Thread values
        arrayList.add(null);
        //arrayList.add(new CanExtendOwn());
    }
}
