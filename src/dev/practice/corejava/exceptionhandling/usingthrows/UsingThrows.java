package dev.practice.corejava.exceptionhandling.usingthrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UsingThrows {

    //Using throws keyword
    public void readFile() throws FileNotFoundException {
        FileInputStream fileInputStream=new FileInputStream(" ");
    }

    //Using throws keyword
    public void readFile1() throws FileNotFoundException {

        //Also we can handle exception which is throws by any method, where that method calling written
        try {
            readFile();
        }catch(Exception exception){
            System.out.println("Please enter valid file path");
        }
        FileInputStream fileInputStream=new FileInputStream(" ");
    }

}
