package dev.practice.java8.predefinedfunctionalinterfaces.predicate.basicpredicate;

import java.util.function.Predicate;

public class BasicPredicate {

    public static void main(String[] args) {

        //Because predicate is a functional interface we can use lambda expression here
        Predicate<Integer> predicate=I->I<50;

        //Predicate have test() method
        //test() only return boolean value
        //Call test() method
        System.out.println(predicate.test(5));
        System.out.println(predicate.test(500));
    }
}
