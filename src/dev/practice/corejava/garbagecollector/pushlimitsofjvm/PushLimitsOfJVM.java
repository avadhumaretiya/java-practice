package dev.practice.corejava.garbagecollector.pushlimitsofjvm;

public class PushLimitsOfJVM {

    int objectNumber=0;

    PushLimitsOfJVM(int objectNumber){
        this.objectNumber=objectNumber;
        System.out.println("Constructor "+objectNumber);
    }

    public static void main(String[] args) {

        //don't give a reference of two objects //so garbage collector walk in before JVM invoke garbage collector
        //It only runs when system is out of memory Otherwise JVM initiate Garbage collector after execution
        for(int i=0;i<=500000;i++) {
            new PushLimitsOfJVM(i);
        }
    }

    //This time finalize may call because here we are creating 500000 objects of class
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize "+objectNumber);
    }
}
