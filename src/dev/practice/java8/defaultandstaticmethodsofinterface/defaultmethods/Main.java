package dev.practice.java8.defaultandstaticmethodsofinterface.defaultmethods;

public class Main {

    public static void main(String[] args) {

        //Call abstract method with lambda expression
        DefaultInterface defaultAndStaticMethodOfInterface=()-> System.out.println("Call Abstract method by lambda expression");
        defaultAndStaticMethodOfInterface.m1();

        //Call default method
        defaultAndStaticMethodOfInterface.m2();

    }
}
