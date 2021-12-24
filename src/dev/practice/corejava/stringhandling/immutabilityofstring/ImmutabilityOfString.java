package dev.practice.corejava.stringhandling.immutabilityofstring;

public class ImmutabilityOfString {

    String s=null;
    ImmutabilityOfString(String s){
        this.s=s;
    }
    public static void main(String[] args) {

        ImmutabilityOfString immutabilityOfString=new ImmutabilityOfString("7SPAN");
        //create two different variables of String
        String s1="Hello";
        String s2="7SPAN";

        //also after using concat method values of both the variables remains same
        //because String is an immutable
        s1.concat(s2);
        s2.concat(s1);
        System.out.println(s1);
        System.out.println(s2);

        //but if we assign those values to same object then it will change the value of string
        //because this will assign new memory location to that particular String object
        s1=s1.concat(s2);
        s2=s2.concat(s1);
        System.out.println(s1);
        System.out.println(s2);

        //difference between mutable and immutable
        //Here we print an object of a class//that also contains value of string
        //but that not displays value of string but that will display hashcode because that can be change
        System.out.println(immutabilityOfString);


    }


}
