package dev.practice.java8.predefinedfunctionalinterfaces.funtion.identityMethod;

import java.util.function.Function;

public class IdentityMethod {

    public static void main(String[] args) {

        //identity() is a static method
        //So we are calling identity() method by Interface name
        //This will return same value we pass
        Function<String,String> function=Function.identity();
        System.out.println(function.apply("avadh"));
    }
}
