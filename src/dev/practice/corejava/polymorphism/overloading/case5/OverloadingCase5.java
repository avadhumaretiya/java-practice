package dev.practice.corejava.polymorphism.overloading.case5;

import dev.practice.corejava.polymorphism.overloading.implementation.OverloadingImplementation;

public class OverloadingCase5 {

    public static void main(String[] args) {

        OverloadingImplementation overloadingImplementation =new OverloadingImplementation();

        overloadingImplementation.intGeneralIntVarArg(1,2,3);//exact match method calling

        //When pass value which is contained by both the return types
        //empty argument
        overloadingImplementation.intGeneralIntVarArg();

        //When pass value which is not contained by any of one return type
        //single argument
        overloadingImplementation.intGeneralIntVarArg(5);
    }
}
