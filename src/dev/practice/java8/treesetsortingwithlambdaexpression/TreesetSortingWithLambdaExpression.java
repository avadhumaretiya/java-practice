package dev.practice.java8.treesetsortingwithlambdaexpression;

import dev.practice.java8.createlistsetmap.Create;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TreesetSortingWithLambdaExpression {

    public static void main(String[] args) {

        //by default treeset procide ascending order
        TreeSet<Integer> treeSet= Create.createTreeSetInteger();
        System.out.println(treeSet);

        //Change order in treeset with lambda expression
        treeSet=Create.createTreeSetIntegerWithLambda();
        System.out.println(treeSet);

    }
}
