package dev.practice.corejava.innerclasses.anonymousinnerclass;

public class RunnableAnonymousInnerClass {

    public static void main(String[] args) {

        //create runnable interface's anonymous class
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Interface Inner Class");
            }
        });

        //Call start() method
        thread.start();
    }
}
