package dev.practice.inheritance.hierarchicalinheritance;

class Child2 extends Parent {

    Child2(){
        System.out.println("Child class constructor");
    }

    //Child class variable
    int i=1000;

    //Child class Method
    String animal(){
        String s="Horse";
        return s;
    }
}
