package dev.practice.polymorphism.overriding.case6;

class Child2 extends Parent {

    /*Parent - protected, child - can be use public*/
    //default, private cannot be used as a child
    public void protectedParent(){
        System.out.println("Call Child class method");
    }

    /*Parent - default, child - can be use protected, public*/
    //private cannot be used as a child
    protected void defaultParent(){
        System.out.println("Call Child class method");
    }
}
