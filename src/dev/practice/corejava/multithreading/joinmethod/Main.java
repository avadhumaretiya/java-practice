package dev.practice.corejava.multithreading.joinmethod;

public class Main {

    public static void main(String[] args) {

        JoinMethod joinMethod=new JoinMethod();
        joinMethod.start();

        //Join method is used to hold every other threads until the current thread not terminated or died
        try {
            joinMethod.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Exited");
        }

        //This statement not run until the run() method execution complete
        System.out.println(joinMethod.k);
    }
}
