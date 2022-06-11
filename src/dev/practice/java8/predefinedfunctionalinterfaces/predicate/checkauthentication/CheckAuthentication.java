package dev.practice.java8.predefinedfunctionalinterfaces.predicate.checkauthentication;

import dev.practice.java8.dao.Dao;

import java.util.Scanner;
import java.util.function.Predicate;

public class CheckAuthentication {

    public static void main(String[] args) {

        //Here we make predicate to check authentication
        Predicate<Dao> predicate=dao->dao.getUsername().equals("avadh")&&dao.getPassword().equals("7SPAN");

        //Scanner class to get values from user
        Scanner scanner=new Scanner(System.in);
        String username= scanner.next();
        String password= scanner.next();

        //Pass username and password in dao constructor and create dao object
        Dao dao=new Dao(username,password);

        //Check predicate test() method
        if(predicate.test(dao)){
            System.out.println("Successfully login");
        }else{
            System.out.println("Please try to login again");
        }
    }
}
