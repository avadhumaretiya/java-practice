package dev.practice.java8.listsortingwithlambdaexpression;

import dev.practice.java8.createlistsetmap.Create;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortingWithLambdaExpression {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList= Create.createArrayListInteger();
        System.out.println(arrayList);

        //Sort arraylist with comparator
        Collections.sort(arrayList,new ComparatorClass());
        System.out.println(arrayList);

        arrayList= Create.createArrayListInteger();
        //Sort arraylist with lambda expression
        //also use conditional operator among if-else
        System.out.println(arrayList);
        Collections.sort(arrayList,(i1,i2)->i1<i2?1:i1>i2?-1:0);
        System.out.println(arrayList);
    }
}
