package dev.practice.staticnonstatic.staticvariables;

public class StaticVariables {

    //static variables can be call by class name no need to create an object of class
    //static variables can be call in static block
    static int i;
    public static void main(String[] args){
        System.out.println("main method call");
        System.out.println(StaticVariables.i);
    }

    static {
        System.out.println(StaticVariables.i);
    }
}
