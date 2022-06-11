package dev.practice.java8.stream.ofmethod;

import java.util.stream.Stream;

public class OfMethod {

    public static void main(String[] args) {

        Double[] d={10.0,10.1,10.2,10.3,10.4};

        //of() method use to apply stream for other than collection types
        Stream<Double> stream=Stream.of(d);
        stream.forEach(System.out::println);

        Stream<Integer> stream1=Stream.of(9,99,999,9999,99999);
        stream1.forEach(System.out::println);
    }
}
