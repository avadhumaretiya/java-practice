package dev.practice.polymorphism.overloading.case1;

import dev.practice.polymorphism.overloading.implementation.OverloadingImplementation;

public class OverloadingCase1 {

    public static void main(String[] args) {

        OverloadingImplementation overloadingImplementation =new OverloadingImplementation();
        overloadingImplementation.intFloat(0);//exact match method calling
        overloadingImplementation.intFloat(0.1f);//exact match method calling

        //check upper level return types
        //sequences are
        //byte->short->int->long->float->double
        //char->int->long->float->double
        overloadingImplementation.intFloat('a');//calling method with char argument
        //overloading.intFloat(0.5);//value is double which is not acceptable//gives compile time error
    }
}
