package dev.practice;

public class OverloadingCase5 {
    public void intGeneralIntVarArg(int i){
        System.out.println("Call int general argument");
    }

    public void intGeneralIntVarArg(int... i){
        System.out.println("Call int var-arg argument");
    }

    public static void main(String[] args) {
        OverloadingCase5 overloading = new OverloadingCase5();

        overloading.intGeneralIntVarArg(1,2,3);//exact match method calling

        //When pass value which is contained by both the return types
        //empty argument
        overloading.intGeneralIntVarArg();

        //When pass value which is not contained by any of one return type
        //single argument
        overloading.intGeneralIntVarArg(5);
    }
}
