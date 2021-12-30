package dev.practice.java8.predefinedfunctionalinterfaces.unaryoperator.basicunaryoperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

    public static void main(String[] args) {

        //Here we use unary operator to get square of number
        //It take only one type
        //which is consider as a type of input and return
        UnaryOperator<Integer> unaryOperator= i->i*i;

        //apply() method to return value
        System.out.println(unaryOperator.apply(20));

    }
}
