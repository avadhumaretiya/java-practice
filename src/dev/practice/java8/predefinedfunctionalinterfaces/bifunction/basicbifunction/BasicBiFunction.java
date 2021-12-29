package dev.practice.java8.predefinedfunctionalinterfaces.bifunction.basicbifunction;

import java.util.function.BiFunction;

public class BasicBiFunction {

    public static void main(String[] args) {

        //Here we create bi function to get product of two numbers
        //Here first two Integer are Input types and last Integer is return type
        BiFunction<Integer,Integer,Integer> biFunction=(i,j)->i*j;

        //apply method to get result
        System.out.println(biFunction.apply(10,20));
    }
}
