package dev.practice.collections.arraylistandlinkedlist.operations;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //also we can initialize list object with giving reference of arraylist
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<100;i=i+10){
            list.add(i);
        }

        OperationsOnArraylist operations=new OperationsOnArraylist();

        //Remove single comment to see perfect outputs
        //operations.insertInArraylist();
        //operations.replaceInArrayList();
        //operations.addAllMethod();
        //operations.searchFromList(list);
        operations.removeAnElement(list);
    }
}
