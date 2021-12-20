package dev.practice.exceptionhandling.finallyblock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FinallyBlock {
    public static void main(String[] args) {

        //Also we can use finally block as a garbage collector
        //With catch block executed
        //With Exception
        try {
            FileInputStream fileInputStream = new FileInputStream(" ");
        }catch(FileNotFoundException e){
            System.out.println("Enter valid file path");
        }finally {
            System.out.println("Generally use to close objects");
        }

        //without catch block executed
        //Without Exception
        try {
            int i=0;
        }catch(Exception e){
            System.out.println("Enter valid file path");
        }finally {
            System.out.println("Generally use to close objects");
        }

        //When return from try and catch block
        try{
            int i=0;
            return;
        }catch(Exception exception){
            return;
        }finally {
            System.out.println("Generally use to close objects");
        }

    }
}
