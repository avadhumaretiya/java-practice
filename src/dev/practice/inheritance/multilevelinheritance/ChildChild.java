package dev.practice.inheritance.multilevelinheritance;

class ChildChild extends Child{
    ChildChild(){
        System.out.println("Sub-Child class constructor");
    }

    //Sub-Child class variable
    int i=1000;

    //Sub-Child class Method
    String animal(){
        String s="Elephant";
        return s;
    }
}
