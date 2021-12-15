package dev.practice.polymorphism.overriding.case6;

public class OverridingCase6 {
    public static void main(String[] args) {
        //When parent method is public and child method is default, private or protected cannot be override
        //When parent method is protected and child method is private or default cannot be override
        //When parent method is default and child method is private cannot be override
        //Because in overriding we can increase the scope but cannot decrease the scope
        //Scope sequence like this
        //Public>Protected>default>private
    }
}
