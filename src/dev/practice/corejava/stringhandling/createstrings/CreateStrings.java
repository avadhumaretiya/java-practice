package dev.practice.corejava.stringhandling.createstrings;

public class CreateStrings {

    public static void main(String[] args) {

        String s1="7SPAN";

        String s2=new String("7SPAN");

        char c[]={'7','S','P','A','N'};
        String s3=new String(c);

        byte b[]={'7',83,80,65,78};
        String s4=new String(b);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }
}
