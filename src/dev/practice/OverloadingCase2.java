package dev.practice;

public class OverloadingCase2 {
    public void stringObject(String s){
        System.out.println("Call String argument");
    }

    public void stringObject(Object o){
        System.out.println("Call Object argument");
    }

    public static void main(String[] args) {
        OverloadingCase2 overloading=new OverloadingCase2();

        overloading.stringObject("String");//exact match method calling
        overloading.stringObject(new Object());//exact match method calling

        //When both return types of arguments contains the value
        //consider child return type
        overloading.stringObject(null);//calling method with argument which contained in both return types
    }
}
