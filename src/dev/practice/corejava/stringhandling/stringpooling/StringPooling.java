package dev.practice.corejava.stringhandling.stringpooling;

public class StringPooling {

    public static void main(String[] args) {

        //Here two variables of String assigned with same value
        //So both variables address to same memory location in string pool
        //String pool creates in Heap memory
        //String pool is thread safe
        String s="7SPAN";
        String s1="7SPAN";

        //string variable with different value
        //So this will address to different memory location in string pool
        String s2="Hello 7SPAN";

        //by using hashcode() method we can check address of string variables
        //first two gets same memory location and third one get different memory location
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
