package dev.practice.corejava.multithreading.joinmethod;

public class JoinMethod extends Thread{

    int k=0;
    //Override method of Thread class
    public void run() {
        for(int j=0;j<200;j++){
            try {
                Thread.sleep(100);
            }catch(InterruptedException exception) {
                System.out.println("Thread exited");
            }
            k += j;
        }
    }
}
