package dev.practice.java8.predefinedfunctionalinterfaces.funtion.basicfunction;

import java.util.function.Function;

public class BasicFunctionInterface {

    public static void main(String[] args) {

        //Create Function to find length
        //Here "String" is an input type and "Integer" is a return type
        Function<String,Integer> function=s->s.length();

        //Function have one method apply()
        //Which can take as any type of input and return any type of data
        System.out.println(function.apply("avadh"));
    }
}
