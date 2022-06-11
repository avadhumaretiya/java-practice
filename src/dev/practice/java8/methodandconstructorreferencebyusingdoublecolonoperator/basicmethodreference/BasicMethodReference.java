package dev.practice.java8.methodandconstructorreferencebyusingdoublecolonoperator.basicmethodreference;

public class BasicMethodReference {

    public static void m2(){
        System.out.println("m2 method");
    }

    public static void main(String[] args) {

        //Here we are creating Interface object with reference of m2() method of current class
        BasicMethodReferenceInterface basicMethodReferenceInterface= BasicMethodReference::m2;

        //Here we are calling m1() method of interface with interface object
        //But because we are giving a reference of m2() method//so m2() method is called
        //It means that we already have an implemented method and we want to apply same implementation to interface method
        //then we directly give reference of current method to interface method
        //This called code reusabillity
        basicMethodReferenceInterface.m1();
    }
}
