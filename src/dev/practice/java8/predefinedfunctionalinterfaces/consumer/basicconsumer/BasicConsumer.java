package dev.practice.java8.predefinedfunctionalinterfaces.consumer.basicconsumer;

import java.util.function.Consumer;

public class BasicConsumer {

    public static void main(String[] args) {

        //Here we create a consumer to print value
        //mandatory to give input type
        //doesn't return any values
        Consumer<String> consumer=s->System.out.println(s);

        //Consumer have accept() method
        //Which consume/get values but doesn't return any value
        consumer.accept("avadh");
    }
}
