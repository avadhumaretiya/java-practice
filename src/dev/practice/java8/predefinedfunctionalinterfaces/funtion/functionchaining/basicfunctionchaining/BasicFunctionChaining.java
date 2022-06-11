package dev.practice.java8.predefinedfunctionalinterfaces.funtion.functionchaining.basicfunctionchaining;

import java.util.Locale;
import java.util.function.Function;

public class BasicFunctionChaining {

    public static void main(String[] args) {

        //We create two functions with different operations on string
        Function<String,String> function=s->{
            System.out.println("First function");
            return s.toUpperCase();
        };
        Function<String,String> function1=s->{
            System.out.println("Second function");
            return s.substring(0,3);
        };

        //Here we can check sequence of execute functions
        System.out.println(function.andThen(function1).apply("avadh"));
        System.out.println(function.compose(function1).apply("avadh"));

        System.out.println();
        integerFunction();
    }

    public static void integerFunction(){

        Function<Integer,Integer> function=i->i+i;
        Function<Integer,Integer> function1=i->i*i*i;

        //Here we can see difference between andThen() and compose() method
        System.out.println(function.andThen(function1).apply(2));
        System.out.println(function.compose(function1).apply(2));
    }
}
