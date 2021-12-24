package dev.practice.corejava.multithreading.usingrunnableinterface;

//Using Runnable interface
//Advantage of runnable interface is that we can extend other class also and implement other interfaces also
public class MultithreadingWithRunnableInterface extends Parent implements Runnable {

    //Existing method of Runnable interface
    //By calling start() method this will go to the run() method and execute that code
    @Override
    public void run() {
        for(int i=0;i<200;i++){
            System.out.print("i: "+i+"\t");
        }

        //call method of entended class
        int j=Parent.check();
    }
}
