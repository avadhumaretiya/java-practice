package dev.practice.multithreading.yieldmethod;

public class Main {

    public static void main(String[] args) {

        //Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        YieldMethod yieldMethod=new YieldMethod();
        //yieldMethod.setPriority(Thread.MAX_PRIORITY);
        yieldMethod.start();
        for(int i=0;i<=10;i++){
            System.out.print("i: "+i+"\t");
        }
    }
}
