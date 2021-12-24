package dev.practice.corejava.multithreading.interuptmethod;

public class Main {

    public static void main(String[] args) {
        InteruptMethod interuptMethod=new InteruptMethod();
        interuptMethod.start();
        //Use interrupt to interrupt current running thread and give chance other thread to execute
        interuptMethod.interrupt();

        for(int i=0;i<=10;i++){
            System.out.println("Main Thread");
        }

    }
}
