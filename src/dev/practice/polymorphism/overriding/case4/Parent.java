package dev.practice.polymorphism.overriding.case4;

class Parent {

    /*Parent method(final), Child method(no-final)*/
    public final void finalCannotOverride(){
        System.out.println("Call Parent class method");
    }

    /*Parent method(no-final), Child method(final)*/
    public void finalCanOverride(){
        System.out.println("Call Parent class method");
    }
}
