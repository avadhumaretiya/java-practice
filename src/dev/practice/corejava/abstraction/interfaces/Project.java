package dev.practice.corejava.abstraction.interfaces;

public interface Project {

    //variables of interface are by default public, static and final
    //variables should be identified because of final keyword
    int i=100;

    //unidentified variables are not allowed in interfaces
    //int j;

    //All the methods of interface are by default public abstract
    String manager();
    String employee();

    //methods of interface should not defined because they are by default abstract
    /*String client(){
        String s="Client name":
    }*/
}
