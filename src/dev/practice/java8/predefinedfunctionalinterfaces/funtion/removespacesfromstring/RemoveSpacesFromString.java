package dev.practice.java8.predefinedfunctionalinterfaces.funtion.removespacesfromstring;

import java.util.function.Function;

public class RemoveSpacesFromString {

    public static void main(String[] args) {

        //Create function for remove spaces from string
        Function<String,String> function=s->s.replaceAll(" ","");
        System.out.println(function.apply("I am working as a developer in 7span"));

        //Create function for count how many spaces in string
        Function<String,Integer> function1=s->s.length()-s.replaceAll(" ","").length();
        System.out.println(function1.apply("I am working as a developer in 7span"));
    }
}
