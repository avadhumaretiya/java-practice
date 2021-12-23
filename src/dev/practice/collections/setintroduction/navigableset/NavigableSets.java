package dev.practice.collections.setintroduction.navigableset;

import sun.reflect.generics.tree.Tree;

import java.util.Set;
import java.util.TreeSet;

public class NavigableSets {

    public TreeSet createSet(){

        TreeSet<Integer> treeSet=new TreeSet<Integer>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        operationsOnNavigableSet(treeSet);
        return treeSet;
    }

    public void operationsOnNavigableSet(TreeSet treeSet){

        //It returns greater than or equal of giving element
        System.out.println(treeSet.ceiling(20));

        //It returns nearest element but higher than given element
        System.out.println(treeSet.higher(20));

        //It returns nearest element but lower and equal than given element
        System.out.println(treeSet.floor(20));

        //It returns nearest element but lower than given element
        System.out.println(treeSet.lower(20));

        //It removes first element
        System.out.println(treeSet.pollFirst());

        //It removes last element
        System.out.println(treeSet.pollLast());

        //It gives a descending order
        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet);
    }
}
