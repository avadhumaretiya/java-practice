package dev.practice.corejava.collections.customrgenericwithrestriction;

public class Main {

    public static void main(String[] args) {

        //We have class which extends thread class and comparator interface
        //so we directly pass that class in type
        CustomGenericClassWithRestriction<CanExtendOwn> canExtendOwnCustomGenericClassWithRestriction
                = new CustomGenericClassWithRestriction<>();

        //If we try to pass other types then it will restrict us to enter values in type
        //Try to enter String
        //CustomGenericClassWithRestriction<String> customGenericClassWithRestriction
        //        =new CustomGenericClassWithRestriction<String>();
    }
}
