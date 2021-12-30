package dev.practice.java8.predefinedfunctionalinterfaces.primitive.primitiveconsumer;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class PrimitiveConsumer {

    public static void main(String[] args) {

        //Here we create IntConsumer
        //Which only take int value as argument
        IntConsumer intConsumer=i->System.out.println(i*i);
        intConsumer.accept(20);

        //Here we create LongConsumer
        //Which only take long value as argument
        LongConsumer longConsumer=l -> System.out.println(l*l);
        longConsumer.accept(10000);

        //Here we create DoubleConsumer
        //Which only take double value as argument
        DoubleConsumer doubleConsumer=d->System.out.println(d*d);
        doubleConsumer.accept(10.20);
    }
}
