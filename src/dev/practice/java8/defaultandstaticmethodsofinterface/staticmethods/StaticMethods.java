package dev.practice.java8.defaultandstaticmethodsofinterface.staticmethods;

public class StaticMethods implements StaticInterface{

    //Static methods of interface cannot be override
    //To check remove comment
    //So if we create here any kind of same name method then it will consider as a separate method
    //@Override
    public static void mm1(){
        System.out.println("Child class static method");
    }

    //Without static keyword
    /*public void mm1(){
        System.out.println("Without static");
    }*/

    //Deceasing scope of method
    /*private void mm1(){
        System.out.println("Decreasing Scope");
    }*/

    public void mm2(){
        //We cannot by Child Class name
        //This will call Child class method
        StaticMethods.mm1();
    }
}
