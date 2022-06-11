package dev.practice.corejava.polymorphism.overloading.case6;

import dev.practice.corejava.polymorphism.overloading.implementation.OverloadingImplementation;

public class OverloadingCase6 {

    public static void main(String[] args) {

        OverloadingImplementation overloadingImplementation =new OverloadingImplementation();
        Animal animal=new Animal();
        Monkey monkey=new Monkey();

        overloadingImplementation.objectObject(animal);//exact match method calling
        overloadingImplementation.objectObject(monkey);//exact match method calling

        //Giving a reference of child class object to parent class object
        Animal animal1=new Monkey();
        overloadingImplementation.objectObject(animal1);

    }
}

