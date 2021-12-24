package dev.practice.corejava.polymorphism.overriding.case5;

class Child extends Parent{
    public void abstractCanOverride(){
        System.out.println("Call Child class method");
    }
}

abstract class Child1 extends Parent1{
    public abstract void abstractCanOverride();
}