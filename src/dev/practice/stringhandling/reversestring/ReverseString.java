package dev.practice.stringhandling.reversestring;

import java.nio.charset.StandardCharsets;

public class ReverseString {

    public String reverseStringWay1(String s){

        String reverse=new String();
        for(int i=s.length();i>0;i--){
            reverse=reverse+s.charAt(i-1);
        }
        return reverse;
    }

    public String reverseStringWay2(String s){

        String reverse;
        byte b[]=s.getBytes();
        byte bReverse[]=new byte[b.length];
        for(int i=0;i<b.length;i++){
            bReverse[i]=b[b.length-i-1];
        }
        reverse=new String(bReverse);
        return reverse;
    }
}
