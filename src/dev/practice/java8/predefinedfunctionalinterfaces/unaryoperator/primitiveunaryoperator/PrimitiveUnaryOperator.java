package dev.practice.java8.predefinedfunctionalinterfaces.unaryoperator.primitiveunaryoperator;

import java.util.function.IntUnaryOperator;

public class PrimitiveUnaryOperator {

    public static void main(String[] args) {

        //Here we use IntUnaryOperator which only take int and return int
        IntUnaryOperator intUnaryOperator=i->i*i;

        //applyAsInt() method get and return int value
        System.out.println(intUnaryOperator.applyAsInt(20));

        //LongUnaryOperator
        //DoubleUnaryOperator
    }
}
