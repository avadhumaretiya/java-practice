package dev.practice.inheritance.hierarchicalinheritance;

class Parent {

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
