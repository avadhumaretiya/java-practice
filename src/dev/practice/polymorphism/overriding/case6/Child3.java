package dev.practice.polymorphism.overriding.case6;

class Child3 extends Parent{

    /*Parent - default, child - can be use protected, public*/
    //private cannot be used as a child
    public void defaultParent(){
        System.out.println("Call Child class method");
    }
}
