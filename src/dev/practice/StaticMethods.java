package dev.practice;

public class StaticMethods {

    //static methods can be call by class name no need to create an object of class
    //static methods can be call in static block
    public static void main(String[] args){
        System.out.println("main method call");
        StaticMethods.check();
    }

    static void check(){
        System.out.println("Static method call");
    }

    static {
        System.out.println("Inside Static Block");
        StaticMethods.check();
    }
}
