package dev.practice.java8.functionalinterface.functionalinterfacewithinheritance.invalidfunctionalinterface.case3;

//Here we are declaring one abstract method
//but here annotation is not valid because parent abstract method and child abstract methods are different
//So here it considers two abstract methods of child interface

//Here we comment an annotation so no error displaying because child interface consider as a normal interface
//remove comment to see an error
//@FunctionalInterface
public interface Child extends InvalidFunctionalInterface {

    //Single abstract method same as parent class
    void mm2();
}
