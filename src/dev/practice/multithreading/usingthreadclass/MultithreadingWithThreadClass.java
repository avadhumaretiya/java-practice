package dev.practice.multithreading.usingthreadclass;

public class MultithreadingWithThreadClass extends Thread{

    //Override method of Thread class
    public void run(){
        for(int i=0;i<200;i++){
            System.out.print("i: "+i+"\t");
        }
    }
}
