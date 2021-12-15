package dev.practice.polymorphism.overriding.case3;

public class OverridingCase3 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        //Here overriding not happens because private access modifier is used
        //Child class cannot use private methods of parent class
    }
}
