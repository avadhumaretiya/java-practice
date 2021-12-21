package dev.practice.stringhandling.stringcomparision;

public class StringComparision {

    public static void main(String[] args) {

        //Directly assign value to string variable
        //these two variables are assigning with same memory location or address
        String s1="7SPAN";
        String s2="7SPAN";

        //create an object of string and assign value
        //this object also have same value but this will assign with different memory location or address
        String s3=new String("7SPAN");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        //there are two methods to compare strings
        //1. double equals == //This will compare address
        //2. .equals()  //This will compare value

        //This time both gives the same results because both variables have directly assigned value
        //So both have same address and same value
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        //This time both gives the different results because both variables have assigned differently
        //So both have same value and different address
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}
