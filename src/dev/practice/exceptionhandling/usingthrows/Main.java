package dev.practice.exceptionhandling.usingthrows;

import java.io.FileNotFoundException;

public class Main {

    //Using throwskeyword
    public static void main(String[] args) throws FileNotFoundException {

        UsingThrows usingThrows=new UsingThrows();
        //Also we can handle exception which is throws by any method, where that method calling written
        try{
            usingThrows.readFile1();
        }catch(Exception exception){
            System.out.println("Please enter valid file path");
        }
        usingThrows.readFile();
    }
}
