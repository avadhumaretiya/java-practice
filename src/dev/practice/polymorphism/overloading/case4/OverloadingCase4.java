package dev.practice.polymorphism.overloading.case4;

import dev.practice.polymorphism.overloading.implementation.OverloadingImplementation;

public class OverloadingCase4 {

    public static void main(String[] args) {

        OverloadingImplementation overloadingImplementation =new OverloadingImplementation();

        overloadingImplementation.orderChange(0, 0.5f);//exact match method calling
        overloadingImplementation.orderChange(0.5f, 0);//exact match method calling

        //When pass value which is contained by both the return types
        //overloadingCase4Implementation.orderChange(0,0);

        //When pass value which is not contained by any of one return type
        //overloadingCase4Implementation.orderChange(0.5f,0.5f);
    }
}
