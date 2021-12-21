package dev.practice.stringhandling.reversestring;

public class Main {

    public static void main(String[] args) {

        ReverseString reverseString=new ReverseString();
        String s="7SPAN";
        System.out.println("Before Reverse : "+s);
        System.out.println("After Reverse : "+reverseString.reverseStringWay1(s));
        System.out.println("After Reverse : "+reverseString.reverseStringWay2(s));
    }
}
