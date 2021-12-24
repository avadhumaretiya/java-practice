package dev.practice.corejava.multithreading.usingthreadclass;

public class Main {

    public static void main(String[] args) {

        MultithreadingWithThreadClass multithreadingWithThreadClass=new MultithreadingWithThreadClass();

        //When we use Thread class at that time we have to create class object and directly call run method by object
        //By calling start() method this will go to the run() method and execute that code
        //simultaneously other code also run which is in second thread
        multithreadingWithThreadClass.start();
        for(int j=0;j<200;j++){
            System.out.print("j: "+j+"\t");
        }
    }
}
