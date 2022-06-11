package dev.practice.java8.functionalinterface.invalidfunctionalinterface;

public interface InvalidFunctionalInterface2 {

    //not a single abstract method
    default void mm1(){
        int i=0;
    }

    static void mm2(){
        int j=0;
    }
}
