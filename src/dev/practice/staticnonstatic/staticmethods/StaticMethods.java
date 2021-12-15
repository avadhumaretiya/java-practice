package dev.practice.staticnonstatic.staticmethods;

public class StaticMethods {

    //static methods can be call by class name no need to create an object of class
    //static methods can be call in static block
    public static void main(String[] args){
        System.out.println("main method call");
        Methods.check();
    }

    static {
        System.out.println("Inside Static Block");
        Methods.check();
    }
}
