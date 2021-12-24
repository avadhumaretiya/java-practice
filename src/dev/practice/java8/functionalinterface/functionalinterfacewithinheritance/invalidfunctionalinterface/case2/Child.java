package dev.practice.java8.functionalinterface.functionalinterfacewithinheritance.invalidfunctionalinterface.case2;

//Here we are declaring one abstract method
//but still annotation is valid here because parent abstract method override here
//Not consider as a second abstract method
@FunctionalInterface
public interface Child extends InvalidFunctionalInterface {

    //Single abstract method same as parent class
    void mm1();
}
