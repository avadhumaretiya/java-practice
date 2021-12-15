package dev.practice.inheritance.multilevelinheritance;

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

    String car(){
        String s="mec";
        return s;
    }

    String Birds(){
        String s="Parrot";
        return s;
    }
}
