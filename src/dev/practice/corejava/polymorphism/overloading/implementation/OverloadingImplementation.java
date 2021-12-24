package dev.practice.corejava.polymorphism.overloading.implementation;

import dev.practice.corejava.polymorphism.overloading.case6.Animal;
import dev.practice.corejava.polymorphism.overloading.case6.Monkey;

public class OverloadingImplementation {

    //Case 1
    public void intFloat(int i){
        System.out.println("Call integer argument");
    }

    public void intFloat(float i){
        System.out.println("Call float argument");
    }

    //Case 2
    public void stringObject(String s){
        System.out.println("Call String argument");
    }

    public void stringObject(Object o){
        System.out.println("Call Object argument");
    }

    //Case 3
    public void stringBufferString(String s){
        System.out.println("Call String argument");
    }

    public void stringBufferString(StringBuffer sb){
        System.out.println("Call StringBuffer argument");
    }

    //Case 4
    public void orderChange(int i,float f){
        System.out.println("Call intF,float argument");
    }

    public void orderChange(float f,int i){
        System.out.println("Call float,int argument");
    }

    //Case 5
    public void intGeneralIntVarArg(int i){
        System.out.println("Call int general argument");
    }

    public void intGeneralIntVarArg(int... i){
        System.out.println("Call int var-arg argument");
    }

    //Case 6
    public void objectObject(Animal animal){
        System.out.println("Call Animal argument");
    }

    public void objectObject(Monkey monkey){
        System.out.println("Call Monkey argument");
    }
}
