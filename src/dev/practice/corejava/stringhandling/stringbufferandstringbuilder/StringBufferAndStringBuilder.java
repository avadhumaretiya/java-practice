package dev.practice.corejava.stringhandling.stringbufferandstringbuilder;

public class StringBufferAndStringBuilder {

    public static void main(String[] args) {

        //We can declare and define stringbuffer object like string
        //StringBuffer is mutable //So we can change the value of stringbuffer
        StringBuffer stringBuffer=new StringBuffer();

        //capacity() method
        //to check capacity of stringbuffer
        //default capacity of stringbuffer is 16
        System.out.println(stringBuffer.capacity());

        //append() method
        //Use to append string or character behind the existing string
        stringBuffer.append("I am working");
        stringBuffer.append(" at 7SPAN ahmedabad");
        stringBuffer.append(", Gujarat - 360015");

        //Check capacity of stringbuffer after entering string more than 16
        //Automatically increase the capacity of the stringbuffer
        System.out.println(stringBuffer.capacity());

        //charAt() method
        //Use to get character of particular position
        System.out.println(stringBuffer.charAt(10));

        //reverse() method
        //Use to reverse string
        System.out.println(stringBuffer.reverse());

        //replace() method
        //Use to replace character or string with any substring
        System.out.println(stringBuffer.replace(22,30,"Science city, Ahmedabad"));

        //insert() method
        //Use to insert character or string on any position in string
        System.out.println(stringBuffer.insert(0,"Hi, "));

        //delete() method
        //Use to delete character or string from any position in string
        System.out.println(stringBuffer.delete(0,2));

        //deleteCharAt() method
        //Use to delete character from given position
        System.out.println(stringBuffer.deleteCharAt(0));
    }
}
