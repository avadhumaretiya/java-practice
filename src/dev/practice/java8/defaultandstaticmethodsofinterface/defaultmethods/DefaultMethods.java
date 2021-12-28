package dev.practice.java8.defaultandstaticmethodsofinterface.defaultmethods;

public class DefaultMethods implements DefaultInterface {

    @Override
    public void m1() {
        System.out.println("Override Abstract Method");
    }

    //Override default method
    @Override
    public void m2() {
        System.out.println("Override default method");

        //Call default method with super method
        DefaultInterface.super.m2();
    }
}
