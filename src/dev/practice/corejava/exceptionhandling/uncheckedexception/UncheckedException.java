package dev.practice.corejava.exceptionhandling.uncheckedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UncheckedException {

    public static void main(String[] args) {

        //Unchecked Exception
        //Check Compile time
        try {
            FileInputStream fileInputStream = new FileInputStream(" ");
        }catch(FileNotFoundException e){
            System.out.println("Enter valid file path");
        }
    }
}
