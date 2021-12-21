package dev.practice.stringhandling.stringmethods;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String s="HELLO 7SPAN";

        //length() method
        //It gives numbers of character in string
        System.out.println(s.length());

        //indexOf() method
        //It gives position of first occurrence of given character or string in String
        System.out.println(s.indexOf("SP"));
        System.out.println(s.indexOf('7'));

        //charAt() method
        //It gives character which is available on given position
        System.out.println(s.charAt(2));

        //subString() method
        //It gives substring from given position to the end
        System.out.println(s.substring(2));
        //It gives substring from given start to end position
        System.out.println(s.substring(2,4));

        //split() method
        //It splits String by charcter or string we entered
        String[] splitedArray=s.split(" ");
        for(int i=0;i<splitedArray.length;i++){
            System.out.println(splitedArray[i]);
        }

        //replace() method
        //It replaces character or String anything we entered
        System.out.println(s.replace('7','8'));
        System.out.println(s.replace("SPAN","SPARTANS"));

        //toUpperCase() method
        //It changes whole string in lowercase
        System.out.println(s.toLowerCase());

        //toLowerCase() method
        //It changes whole string in uppercase
        System.out.println(s.toLowerCase());

    }
}
