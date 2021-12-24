package dev.practice.corejava.multithreading.usingrunnableinterface;

public class Main {

    public static void main(String[] args) {

        MultithreadingWithRunnableInterface multithreadingWithRunnableInterface=new MultithreadingWithRunnableInterface();

        //When we use Runnable interface at that time we have to create thread class object and pass object of main class in the argument of thread class
        Thread thread=new Thread(multithreadingWithRunnableInterface);
        //Then call the method start() of thread class
        //By calling start() method this will go to the run() method and execute that code
        //simultaneously other code also run which is in second thread
        thread.start();
        for(int j=0;j<200;j++){
            System.out.print("j: "+j+"\t");
        }
    }
}
