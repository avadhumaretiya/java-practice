package dev.practice.java8.methodandconstructorreferencebyusingdoublecolonoperator.methodreferencewithrunnableinterface;

public class MethodReferenceWithRunnableInterface {

    public void m1(){
        for(int i=0;i<10;i++){
            System.out.println("Thread "+i);
        }
    }
    public static void main(String[] args) {

        MethodReferenceWithRunnableInterface methodReferenceWithRunnableInterface=new MethodReferenceWithRunnableInterface();

        //Here we are providing method reference to runnable interface
        //no need to provide parenthesis
        Runnable runnable=methodReferenceWithRunnableInterface::m1;
        Thread thread=new Thread(runnable);
        thread.start();

        //Main method for loop
        for(int i=0;i<10;i++){
            System.out.println("Main Thread "+i);
        }
    }
}
