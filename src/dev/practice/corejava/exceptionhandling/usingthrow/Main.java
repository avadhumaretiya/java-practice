package dev.practice.corejava.exceptionhandling.usingthrow;

public class Main {

    public static void main(String[] args) {

        UsingThrow usingThrow=new UsingThrow();

        //Call method with throw keyword and without handling thrown exception
        try {
            usingThrow.division(4, 0);
        }catch(Exception exception){
            System.out.println("Thrown exception cached");
        }

        //Call method with throw keyword and without handling thrown exception
        //Displays created exception
        usingThrow.division(4,0);
    }
}
