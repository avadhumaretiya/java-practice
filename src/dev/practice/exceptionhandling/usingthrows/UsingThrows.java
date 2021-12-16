package dev.practice.exceptionhandling.usingthrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UsingThrows {

    //Using throws keyword
    public void readFile() throws FileNotFoundException {
        FileInputStream fileInputStream=new FileInputStream(" ");
    }

    //Using throwskeyword
    public static void main(String[] args) throws FileNotFoundException {
        UsingThrows usingThrows=new UsingThrows();
        usingThrows.readFile();
    }
}
