package dev.practice.innerclasses.anonymousinnerclass;

public class Main {

    public static void main(String[] args) {

        //Create Connection object
        Connection connection=AnonymousInnerClass.getConnection();

        //call method of connection interface
        connection.createStatement();
    }
}
