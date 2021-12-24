package dev.practice.corejava.abstraction.basicabstraction;

public abstract class Project {

    //need at least one abstract method
    //abstract class cannot be final because abstract class needs to extend in child class
    //abstract method can be only declare //define in child class
    abstract String manager();
    abstract String employee();

    //abstract methods cannot be static because every child class has their separate method definition
    //abstract static String salary();

    public void project(){
        String s="Business Management";
    }

    //main method can be create in abstract class
    /*public static void main(String[] args) {

    }*/

}
