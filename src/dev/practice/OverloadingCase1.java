package dev.practice;

public class OverloadingCase1 {

    public void intFloat(int i){
        System.out.println("Call integer argument");
    }

    public void intFloat(float i){
        System.out.println("Call float argument");
    }

    public static void main(String[] args) {
        OverloadingCase1 overloading=new OverloadingCase1();

        overloading.intFloat(0);//exact match method calling
        overloading.intFloat(0.1f);//exact match method calling

        //check upper level return types
        //sequences are
        //byte->short->int->long->float->double
        //char->int->long->float->double
        overloading.intFloat('a');//calling method with char argument
        //overloading.intFloat(0.5);//value is double which is not acceptable//gives compile time error
    }
}
