package dev.practice;

public class OverloadingCase4 {
    public void orderChange(int i,float f){
        System.out.println("Call intF,float argument");
    }

    public void orderChange(float f,int i){
        System.out.println("Call float,int argument");
    }

    public static void main(String[] args) {
        OverloadingCase4 overloading = new OverloadingCase4();

        overloading.orderChange(0, 0.5f);//exact match method calling
        overloading.orderChange(0.5f, 0);//exact match method calling

        //When pass value which is contained by both the return types
        //overloading.orderChange(0,0);

        //When pass value which is not contained by any of one return type
        //overloading.orderChange(0.5f,0.5f);
    }
}
