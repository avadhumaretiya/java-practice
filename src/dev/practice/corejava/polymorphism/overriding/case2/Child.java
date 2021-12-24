package dev.practice.corejava.polymorphism.overriding.case2;

class Child extends Parent {
    public String coVarientReturnType(){
        System.out.println("Call Child class method");
        return null;
    }
}
