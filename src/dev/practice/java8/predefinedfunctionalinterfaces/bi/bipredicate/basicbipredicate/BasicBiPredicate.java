package dev.practice.java8.predefinedfunctionalinterfaces.bi.bipredicate.basicbipredicate;

import java.util.function.BiPredicate;

public class BasicBiPredicate {

    public static void main(String[] args) {

        //Here we create bipredicate to check sum of two numbers is even or not
        //Both input types are Integer
        BiPredicate<Integer,Integer> biPredicate=(i,j)->(i+j)%2==0;

        //test() method which return boolean value
        System.out.println(biPredicate.test(10,20));
        System.out.println(biPredicate.test(5,20));
    }
}
