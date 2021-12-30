package dev.practice.java8.predefinedfunctionalinterfaces.primitive.primitivesupplier;

import java.util.function.IntSupplier;

public class PrimitiveSupplier {

    public static void main(String[] args) {

        //Here we create IntSupplier
        //Which return only int value
        IntSupplier intSupplier=()->{
            return (int)(Math.random()*100000);
        };
        //getAsInt() method return only int value
        System.out.println(intSupplier.getAsInt());

        //LongSupplier->method getAsLong()
        //DoubleSupplier->method getAsDouble()
    }
}
