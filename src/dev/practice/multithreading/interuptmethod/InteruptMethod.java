package dev.practice.multithreading.interuptmethod;

public class InteruptMethod extends Thread{

    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Other thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Got Interrupted");
            }
        }
    }
}
