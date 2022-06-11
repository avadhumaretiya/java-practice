package dev.practice.corejava.multithreading.sleepmethod;

public class SleepMethod extends Thread{

    //Override method of Thread class
    public void run(){
        for(int i=0;i<200;i++){

            //Sleep() method use to sleep thread for sometime
            //Time should be applied in argument and it is in millisecond
            //1000 Millisecond -> 1 Second
            try {
                Thread.sleep(1000);
            }catch(InterruptedException exception){
                System.out.println("Thread exited");
            }
            System.out.print("i: "+i+"\t");
        }
    }

}
