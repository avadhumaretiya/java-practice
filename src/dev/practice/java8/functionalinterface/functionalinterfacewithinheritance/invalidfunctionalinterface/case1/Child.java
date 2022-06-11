package dev.practice.java8.functionalinterface.functionalinterfacewithinheritance.invalidfunctionalinterface.case1;

//Here we are not declaring any abstract method
//but still annotation is valid here because parent abstract method also considered as a child abstract method
@FunctionalInterface
public interface Child extends InvalidFunctionalInterface{

}
