package dev.practice.java8.defaultandstaticmethodsofinterface.staticmethods;

public class Main {

    public static void main(String[] args) {

        //We can call static method of interface only by Interface name
        StaticMethods staticMethods=new StaticMethods();
        staticMethods.mm2();
        //Call child class static method
        StaticMethods.mm1();

        //Call Interface static method
        StaticInterface.mm1();
    }
}
