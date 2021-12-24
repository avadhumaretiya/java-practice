package dev.practice.corejava.polymorphism.overloading.case3;

import dev.practice.corejava.polymorphism.overloading.implementation.OverloadingImplementation;

public class OverloadingCase3 {

    public static void main(String[] args) {

        OverloadingImplementation overloadingImplementation =new OverloadingImplementation();

        overloadingImplementation.stringBufferString("String");//exact match method calling
        overloadingImplementation.stringBufferString(new StringBuffer("StringBuffer"));//exact match method calling

        //When both return types of arguments contains the value
        //both are at same level
        //overloadingCase3Implementation.stringBufferString(null);//gives compile time error
    }
}
