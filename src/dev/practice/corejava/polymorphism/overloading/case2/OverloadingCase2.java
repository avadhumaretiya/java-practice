package dev.practice.corejava.polymorphism.overloading.case2;

import dev.practice.corejava.polymorphism.overloading.implementation.OverloadingImplementation;

public class OverloadingCase2 {

    public static void main(String[] args) {

        OverloadingImplementation overloadingImplementation =new OverloadingImplementation();
        overloadingImplementation.stringObject("String");//exact match method calling
        overloadingImplementation.stringObject(new Object());//exact match method calling

        //When both return types of arguments contains the value
        //consider child return type
        overloadingImplementation.stringObject(null);//calling method with argument which contained in both return types
    }
}
