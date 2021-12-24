package dev.practice.corejava.abstraction.basicabstraction;

class Employee extends Manager{

    //because, here we don't take a child class as an abstract class, we need to define all the methods of abstract class in child class
    @Override
    String manager() {
        String s="manager name";
        return s;
    }

    @Override
    String employee() {
        String s="employee name";
        return s;
    }
}
