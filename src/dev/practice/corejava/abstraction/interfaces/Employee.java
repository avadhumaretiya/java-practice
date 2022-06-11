package dev.practice.corejava.abstraction.interfaces;

public class Employee implements Project{

    //need to implement al the methods of interface in child class
    @Override
    public String manager() {
        String s="Manager name";
        return  s;
    }

    @Override
    public String employee() {
        String s="Employee name";
        return  s;
    }
}
