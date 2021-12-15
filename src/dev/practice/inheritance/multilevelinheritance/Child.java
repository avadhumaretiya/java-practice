package dev.practice.inheritance.multilevelinheritance;

class Child extends Parent{

    Child(){
        System.out.println("Child class constructor");
    }

    //Child class variable
    int i=500;

    //Child class Method
    String animal(){
        String s="donkey";
        return s;
    }

    String food(){
        String s="Pizza";
        return s;
    }
}