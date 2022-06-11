package dev.practice.corejava.multithreading.yieldmethod;

public class YieldMethod extends Thread{

    public void run(){
        for(int j=0;j<=10;j++){
            System.out.print("j: "+j+"\t");
                //Call yield() Method for YieldMethod thread
                //Call by Class name//So Yield method is static
                //yield() method hold thread and give chance to execute other same priority threads//If there is no threads then thread continue to execute
                YieldMethod.yield();
        }
    }
}
