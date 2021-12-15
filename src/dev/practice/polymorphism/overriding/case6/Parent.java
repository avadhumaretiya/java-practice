package dev.practice.polymorphism.overriding.case6;

class Parent {

    /*Parent - public, child - no any modifier possible*/
    //protected, default, private cannot be used as a child
    public void publicParent(){
        System.out.println("Call Parent class method");
    }

    /*Parent - protected, child - can be use public*/
    //default, private cannot be used as a child
    protected void protectedParent(){
        System.out.println("Call Parent class method");
    }

    /*Parent - default, child - can be use protected, public*/
    //private cannot be used as a child
    void defaultParent(){
        System.out.println("Call Parent class method");
    }
}
