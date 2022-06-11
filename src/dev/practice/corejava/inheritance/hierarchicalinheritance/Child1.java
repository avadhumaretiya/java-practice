package dev.practice.corejava.inheritance.hierarchicalinheritance;

class Child1 extends Parent {

    Child1(){
        System.out.println("Child class constructor");
    }

    //Child class variable
    int i=500;

    //Child class Method
    String animal(){
        String s="donkey";
        return s;
    }
}
