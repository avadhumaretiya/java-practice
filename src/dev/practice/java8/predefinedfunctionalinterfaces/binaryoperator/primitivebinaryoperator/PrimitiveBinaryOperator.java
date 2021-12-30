package dev.practice.java8.predefinedfunctionalinterfaces.binaryoperator.primitivebinaryoperator;

import java.util.function.IntBinaryOperator;

public class PrimitiveBinaryOperator {

    public static void main(String[] args) {

        //Here we create IntBinaryOperator
        //Which only allow to input and return int value
        IntBinaryOperator intBinaryOperator=(i,i1)->i*i1;

        //applyAsInt() method to get and return valyue as int
        System.out.println(intBinaryOperator.applyAsInt(10,20));

        //LongBinaryOperator
        //DoubleBinaryOperator
    }
}
