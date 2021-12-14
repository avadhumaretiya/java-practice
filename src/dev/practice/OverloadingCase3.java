package dev.practice;

public class OverloadingCase3 {
    public void stringBufferString(String s){
        System.out.println("Call String argument");
    }

    public void stringBufferString(StringBuffer sb){
        System.out.println("Call StringBuffer argument");
    }

    public static void main(String[] args) {
        OverloadingCase3 overloading=new OverloadingCase3();

        overloading.stringBufferString("String");//exact match method calling
        overloading.stringBufferString(new StringBuffer("StringBuffer"));//exact match method calling

        //When both return types of arguments contains the value
        //both are at same level
        //overloading.stringBufferString(null);//gives compile time error
    }
}
