package dev.practice.exceptionhandling.usingthrow;

public class UsingThrow {

    public void division(int i,int j) {
        try {
            int k = i / j;
        }catch(Exception exception) {
            System.out.println("Please do not enter zero");
        }

        //Throw exception as per requirement
        throw new ArithmeticException("Infinite Result");
    }

}
