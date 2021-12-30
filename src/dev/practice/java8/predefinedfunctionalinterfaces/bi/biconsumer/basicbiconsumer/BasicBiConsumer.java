package dev.practice.java8.predefinedfunctionalinterfaces.bi.biconsumer.basicbiconsumer;

import java.util.function.BiConsumer;

public class BasicBiConsumer {

    public static void main(String[] args) {

        //Create biconsumer to concat strings and print
        BiConsumer<String,String> biConsumer=(s,s1)->System.out.println(s+s1);

        //use accpet()
        biConsumer.accept("avadh"," umretiya");
    }
}
