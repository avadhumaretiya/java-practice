package dev.practice.corejava.polymorphism.overriding.case3;

class Child extends Parent{
    private void privateCannotOverride(){
        System.out.println("Call Child class method");
    }
}
