package dev.practice.java8.functionalinterface.functionalinterfaceannotation.invalidfunctionalinterfaceannotation;

//remove comment to see an error
//@FunctionalInterface
public interface InvalidFunctionalInterfaceAnnotation1 {

    //Not a single abstract method
    default void m1(){
        int i=0;
    }

    static void m2(){
        int i=0;
    }
}
