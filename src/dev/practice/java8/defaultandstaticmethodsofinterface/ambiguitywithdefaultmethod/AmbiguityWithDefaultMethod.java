package dev.practice.java8.defaultandstaticmethodsofinterface.ambiguitywithdefaultmethod;

//Here we implement two interfaces with same default methods
public class AmbiguityWithDefaultMethod implements First,Second{

    @Override
    public void mm1() {
        System.out.println("Abstract method implementation");
    }

    //If we don't provide an implementation of default method then display compile time error
    @Override
    public void mm2() {

        //If we need definition of First interface
        First.super.mm2();

        //If we need definition of Second interface
        Second.super.mm2();

        //Or we can apply new implementation
        System.out.println("New Implementation");
    }
}
