package dev.practice.inheritance.singleinheritance;

class Parent {

    //By default Object class is extended to all the classes
    //In java Multiple inheritance not possible//So any class can not extend more than one class

    Parent(){
        System.out.println("Parent class Constructor");
    }

    //parent class variable
    int i=100;

    //parent class methods
    String animal(){
        String s="monkey";
        return s;
    }

    //parent class method
    String car(){
        String s="mec";
        return s;
    }
}