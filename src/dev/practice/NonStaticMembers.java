package dev.practice;

public class NonStaticMembers {

    //none static variable
    int i;

    //constructor
    NonStaticMembers(){
        System.out.println("Constructor");
    }

    //none static block
    {
        System.out.println("Non Static Block");
    }

    public static void main(String[] args){
        System.out.println("Main method");
        //When we create an instance of an object at that time firstly none static block should run first then run constructor
        new NonStaticMembers();
    }
}
