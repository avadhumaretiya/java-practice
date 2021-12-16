package dev.practice.exceptionhandling.inbuildexception;

import java.util.Scanner;

public class InbuildExceptions {

    public static void main(String[] args) {

        int i=0;
        int j=1;

        //don't get exception
        int k=i/j;

        //getting arithmetic exception
        k=j/i;
    }
}
