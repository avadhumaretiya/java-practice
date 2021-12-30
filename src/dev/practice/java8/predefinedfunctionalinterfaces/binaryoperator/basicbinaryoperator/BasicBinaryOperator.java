package dev.practice.java8.predefinedfunctionalinterfaces.binaryoperator.basicbinaryoperator;

import java.util.function.BinaryOperator;

public class BasicBinaryOperator {

    public static void main(String[] args) {

        //Here we create BinaryOperator
        //Which allow to add two input value
        //Type of input and return type are same
        //Here we use String type
        BinaryOperator<String> binaryOperator=(s,s1)->s+s1;

        //apply() method to get two input value and return same type value
        System.out.println(binaryOperator.apply("avadh"," umretiya"));
    }
}
