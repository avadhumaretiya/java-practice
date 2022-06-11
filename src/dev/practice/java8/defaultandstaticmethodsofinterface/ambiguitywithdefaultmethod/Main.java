package dev.practice.java8.defaultandstaticmethodsofinterface.ambiguitywithdefaultmethod;

public class Main {

    public static void main(String[] args) {

        //Call abstract method with lambda expression
        First first=()-> System.out.println("Call Abstract method by lambda expression");
        first.mm1();

        Second second=()->System.out.println("Call Abstract method by lambda expression");
        second.mm1();

        //Call default methods by both interfaces objects
        first.mm2();
        second.mm2();
    }
}
