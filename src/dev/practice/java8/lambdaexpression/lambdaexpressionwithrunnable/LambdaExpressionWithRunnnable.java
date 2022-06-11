package dev.practice.java8.lambdaexpression.lambdaexpressionwithrunnable;

public class LambdaExpressionWithRunnnable {

    public static void main(String[] args) {

        //create thread with lambda expression
        //no need to implement runnable interface
        Runnable r=()->{
            for (int i=0;i<10;i++){
                System.out.println(i);
            }
        };

        Thread thread=new Thread(r);
        thread.start();

        //Also we can directly write lambda expression in Thread argument
        Thread thread1=new Thread(()->{
            for (int i=0;i<10;i++){
                System.out.println(i);
            }
        });
        thread1.start();

        for (int j=0;j<10;j++){
            System.out.println(j);
        }
    }
}
