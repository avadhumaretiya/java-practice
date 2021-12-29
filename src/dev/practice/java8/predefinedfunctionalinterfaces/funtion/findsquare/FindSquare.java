package dev.practice.java8.predefinedfunctionalinterfaces.funtion.findsquare;

import java.util.function.Function;

public class FindSquare {

    public static void main(String[] args) {

        //Create a function to find square
        Function<Integer,Integer> function=x->x*x;

        //apply() method to get integer value and return integer value
        System.out.println(function.apply(5));
        System.out.println(function.apply(10));
    }
}
