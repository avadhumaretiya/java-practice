package dev.practice.java8.predefinedfunctionalinterfaces.predicate.checkstringstartwith;

import java.util.function.Predicate;

public class CheckStringStartWith {

    public static void main(String[] args) {

        String s[]={"Avadh","Hetvi","7SPAN","Akshay"};

        //Predicate to check string start with 'A' or not
        Predicate<String> predicate=a->a.startsWith("A");

        for(String s1:s){
            if(predicate.test(s1)){
                System.out.println(s1);
            }
        }
    }
}
