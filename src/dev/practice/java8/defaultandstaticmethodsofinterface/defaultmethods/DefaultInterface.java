package dev.practice.java8.defaultandstaticmethodsofinterface.defaultmethods;

public interface DefaultInterface {

    void m1();

    default void m2(){
        System.out.println("default method");
    }
}
