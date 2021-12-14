package dev.practice;

class Parent1{
    public Object coVarientReturnType(){
        System.out.println("Call Parent class method");
        return null;
    }
}
class Child1 extends Parent1{
    public String coVarientReturnType(){
        System.out.println("Call Child class method");
        return null;
    }
}
public class OverridingCase2 {
    public static void main(String[] args) {

        //Different return types then also happen overriding here
        //This thing possible with and after java version 1.5

        //Co-Varient return type concept not supported to primitive return types like Double->Integer
        //Overriding possible in following parent-child return types combination
        //Object->String//Object->StringBuffer//Object->StringBuilder//Number->Integer//Number->Float//Number->Double//etc..

        //To compile code with different version follow this
        //javac -source 1.4 OverridingCase2.java
        //javac -source 1.5 OverridingCase2.java
        Parent1 parent = new Parent1();
        Child1 child = new Child1();

        Object object1=parent.coVarientReturnType();//exact call method
        String string1=child.coVarientReturnType();//exact call method

        Parent1 parent1=new Child1();//call method after giving a child object reference to parent object
        object1=parent1.coVarientReturnType();//method of child class will call because here runtime polymorphism happens
    }
}
