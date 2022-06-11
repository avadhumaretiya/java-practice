package dev.practice.java8.predefinedfunctionalinterfaces.predicate.joinpredicate;

import java.util.function.Predicate;

public class CheckPredicate {

    public static void check(int[] x){

        //Make two predicates object with lambda expression
        Predicate<Integer> predicate=a->a>10;
        Predicate<Integer> predicate1=a->a%2==0;

        //Check if predicate returns false this method return true
        printIfTrue(predicate.negate(),x,"If predicate returns false");

        //Check both predicate
        //If both return true then true
        //If anyone or both are false then return false
        printIfTrue(predicate.and(predicate1),x,"Both predicates are true");

        //Check both predicate
        //If both return false then false
        //If anyone or both are return true then return true
        printIfTrue(predicate.or(predicate1),x,"Anyone predicate is true");
    }

    public static void printIfTrue(Predicate<Integer> predicate, int[] x, String message){

        for(int i:x){
            if(predicate.test(i)){
                System.out.println(message+i);
            }
        }
    }
}
