package dev.practice.java8.ownobjectsortingwithlambdaexpression;

import dev.practice.java8.createlistsetmap.Create;
import dev.practice.java8.dao.Dao;

import java.util.ArrayList;
import java.util.Collections;

public class OwnObjectSortingWithLambdaExpression {

    public static void main(String[] args) {

        ArrayList<Dao> arrayList= Create.createDaoList();

        System.out.println(arrayList);

        //Here we are writing a lambda expression for dao sorting in descending by id
        Collections.sort(arrayList,(e1,e2)-> e1.getId()>e2.getId()?-1: e1.getId()<e2.getId()?1:0);
        System.out.println(arrayList);

        //Here we are writing a lambda expression for dao sorting in ascending by id
        Collections.sort(arrayList,(e1,e2)-> e1.getId()>e2.getId()?1: e1.getId()<e2.getId()?-1:0);
        System.out.println(arrayList);
    }
}
