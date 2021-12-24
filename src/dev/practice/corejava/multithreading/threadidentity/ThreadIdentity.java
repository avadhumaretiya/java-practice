package dev.practice.corejava.multithreading.threadidentity;

public class ThreadIdentity extends Thread{

    public void run(){

        //Thread.currentThread() method gives current running thread name
        Thread currentThread=Thread.currentThread();

        //currentThread.getName() gives name of the current running thread
        System.out.println("Thread Name is : "+currentThread.getName());

        //currentThread.setName() allows set name of the thread
        currentThread.setName("blackmoon");

        //currentThread.getName() gives name of the current running thread
        System.out.println("Thread Name is : "+currentThread.getName());
    }

}
