package dev.practice.corejava.polymorphism.overriding.case2;

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
        Parent parent = new Parent();
        Child child = new Child();

        Object object1=parent.coVarientReturnType();//exact call method
        String string1=child.coVarientReturnType();//exact call method

        Parent parent1=new Child();//call method after giving a child object reference to parent object
        object1=parent1.coVarientReturnType();//method of child class will call because here runtime polymorphism happens
    }
}
