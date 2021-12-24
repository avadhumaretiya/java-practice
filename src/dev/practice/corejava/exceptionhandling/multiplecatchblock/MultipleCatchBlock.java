package dev.practice.corejava.exceptionhandling.multiplecatchblock;

public class MultipleCatchBlock {
    public static void main(String[] args) {

        int i=0;
        int j=1;
        String s="abcd";

        //Handling Exception by try and multiple catch blocks
        try{

            //Exception caused code 1
            int k=i/j;

            //Exception caused code 2
            int l = Integer.parseInt(s);
        }
        catch(ArithmeticException e){
            //Use specific exception class
            System.out.println("Please do not assign 0 value to devider variable");
        }
        catch(NumberFormatException e){
            //Use specific exception class
            System.out.println("Please check entered string");
        }
    }

}
