package dev.practice.java8.defaultandstaticmethodsofinterface.ambiguitywithdefaultmethod;

public interface Second {

    void mm1();

    default void mm2(){
        System.out.println("Second Default Method");
    }
}
