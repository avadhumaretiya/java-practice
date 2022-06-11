package dev.practice.java8.functionalinterface.basicfunctionalinterface;

public interface BasicFunctionalInterface {

    //Functional Interface can only have one abstract method
    void mm1();

    //Can have multiple default and static methods
    default  void mm2(){
        int i=0;
    }

    default  void mm3(){
        int i=0;
    }

    static void mm4(){
        int i=0;
    }

    static void mm5(){
        int i=0;
    }

}
