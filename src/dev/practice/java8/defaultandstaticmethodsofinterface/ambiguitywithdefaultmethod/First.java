package dev.practice.java8.defaultandstaticmethodsofinterface.ambiguitywithdefaultmethod;

public interface First {

    void mm1();

    default void mm2(){
        System.out.println("First Default Method");
    }
}
