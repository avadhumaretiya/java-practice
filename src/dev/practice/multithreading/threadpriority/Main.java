package dev.practice.multithreading.threadpriority;

public class Main {

    public static void main(String[] args) {

        ThreadPriority threadPriority=new ThreadPriority();
        threadPriority.setName("Main Thread");
        //Set priority of Thread
        threadPriority.setPriority(Thread.MAX_PRIORITY);
        threadPriority.threads();
        threadPriority.start();

    }
}
