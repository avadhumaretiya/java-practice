package dev.practice.corejava.polymorphism.overriding.case5;

/*Parent abstract, Child no-abstract*/
abstract class Parent{
    public abstract void abstractCanOverride();
}

/*Parent no-abstract, Child Abstract*/
class Parent1{
    public void abstractCanOverride(){
        System.out.println("Call Parent class method");
    }
}
