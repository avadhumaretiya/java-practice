package dev.practice.corejava.innerclasses.anonymousinnerclass;

public class AnonymousInnerClass {

    //Create a static method of return type Interface
    static Connection getConnection(){

        //We cannot create an instance of an Interface
        //So we create an anonymous class of an Interface
        Connection connection=new Connection() {

            //Override all the methods of an interface
            @Override
            public String createStatement() {

                //Write a logic as per requirement
                System.out.println("Anonymous inner class method");

                return "Anonymous Inner Class";
            }
        };

        //return anonymous class object
        return connection;
    }
}
