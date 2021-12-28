package dev.practice.java8.treemapsortingwithlambdaexpression;

import dev.practice.java8.createlistsetmap.Create;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreemapSortingWithLambdaExpression {

    public static void main(String[] args) {

        //by default TreeMap provide ascending order
        TreeMap<Integer,String> treeMap= Create.createTreeMapInteger();
        System.out.println(treeMap);

        //Change order in TreeMap with lambda expression
        treeMap=Create.createTreeMapIntegerWithLambda();
        System.out.println(treeMap);

    }
}
