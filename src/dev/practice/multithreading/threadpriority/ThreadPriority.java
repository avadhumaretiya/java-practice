package dev.practice.multithreading.threadpriority;

public class ThreadPriority extends Thread{

    public void threads(){

        //Create three threads with different priorities
        ThreadPriority mainThread2=new ThreadPriority();
        mainThread2.setName("Second Thread");
        //Set priority of Thread
        mainThread2.setPriority(Thread.NORM_PRIORITY);

        ThreadPriority mainThread3=new ThreadPriority();
        mainThread3.setName("Third Thread");
        //Set priority of Thread
        mainThread3.setPriority(Thread.MIN_PRIORITY);

        ThreadPriority mainThread= new ThreadPriority();
        mainThread.setName("First Thread");
        //Set priority of Thread
        mainThread.setPriority(Thread.MAX_PRIORITY);

        //Start all the threads in random sequence of priorities
        //Run threads as per priority is not true everytime//it depends upon the JVM to set priorities of threads
        mainThread2.start();
        mainThread3.start();
        mainThread.start();

    }
    public void run(){
        System.out.println("Thread : "+Thread.currentThread().getName());
    }
}
