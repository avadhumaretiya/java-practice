package dev.practice;

class Parent{
    public void noArgumentOverriding(){
        System.out.println("Call Parent class method");
    }
}
class Child extends Parent{
    public void noArgumentOverriding(){
        System.out.println("Call Child class method");
    }
}
public class OverridingCase1 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.noArgumentOverriding();//exact call method
        child.noArgumentOverriding();//exact call method

        Parent parent1=new Child();//call method after giving a child object reference to parent object
        parent1.noArgumentOverriding();//method of child class will call because here runtime polymorphism happens
    }

}

