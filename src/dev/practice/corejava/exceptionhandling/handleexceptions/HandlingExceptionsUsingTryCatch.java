package dev.practice.corejava.exceptionhandling.handleexceptions;

public class HandlingExceptionsUsingTryCatch {

    public static void main(String[] args) {


        int a[]={1,2,3};

        //Handling Exception by try-catch
        try {
            for (int i = 0; i <= 3; i++) {
                int j = a[i];
            }
        }
        catch(Exception e){
            //Use general Exception Class
            System.out.println("Please do not enter index out of length of an array");
        }
        System.out.println(a[0]);
        /**/

        int i=0;
        int j=1;
        int k=i/j;

        //Handling Exception by try-catch
        try{
            k=i/j;
        }
        catch(ArithmeticException e){
            //Use specific exception class
            System.out.println("Please do not assign 0 value to devider variable");
        }
        /**/

        String s="abcd";
        //Handling Exception by try-catch
        try {
            int l = Integer.parseInt(s);
        }catch(NumberFormatException e){
            //Use specific exception class
            System.out.println("Please check entered string");
        }
        /**/

    }
}
