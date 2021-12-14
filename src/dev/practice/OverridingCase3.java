package dev.practice;

class Parent2{
    private void privateCannotOverride(){
        System.out.println("Call Parent class method");
    }
}
class Child2 extends Parent2{
    private void privateCannotOverride(){
        System.out.println("Call Child class method");
    }
}
public class OverridingCase3 {
    public static void main(String[] args) {
        Parent2 parent = new Parent2();
        Child2 child = new Child2();
        //Here overriding not happens because private access modifier is used
        //Child class cannot use private methods of parent class
    }
}
