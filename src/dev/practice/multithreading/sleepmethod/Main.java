package dev.practice.multithreading.sleepmethod;

public class Main {

    public static void main(String[] args) {

        SleepMethod sleepMethod=new SleepMethod();

        //When we use Thread class at that time we have to create class object and directly call start() method by object
        //By calling start() method this will go to the run() method and execute that code
        //simultaneously other code also run which is in second thread
        sleepMethod.start();
        for(int j=0;j<200;j++){

            //Sleep() method use to sleep thread for sometime
            //Time should be applied in argument and it is in millisecond
            //1000 Millisecond -> 1 Second
            try {
                Thread.sleep(1000);
            }catch(InterruptedException exception){
                System.out.println("Thread exited");
            }
            System.out.print("j: "+j+"\t");
        }
    }
}
