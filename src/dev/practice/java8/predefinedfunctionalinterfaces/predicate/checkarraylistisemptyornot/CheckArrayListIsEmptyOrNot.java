package dev.practice.java8.predefinedfunctionalinterfaces.predicate.checkarraylistisemptyornot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class CheckArrayListIsEmptyOrNot {

    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList();

        //Check if arraylist is an empty or not
        Predicate<Collection> predicate= c->c.isEmpty();
        System.out.println(predicate.test(arrayList));

        //add element in arraylist then check
        arrayList.add("Avadh");
        System.out.println(predicate.test(arrayList));
    }
}
