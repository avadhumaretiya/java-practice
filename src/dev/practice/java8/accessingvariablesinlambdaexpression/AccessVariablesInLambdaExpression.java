package dev.practice.java8.accessingvariablesinlambdaexpression;

public class AccessVariablesInLambdaExpression {

    int i=10;
    public void mm2(){
        int j=20;
        Main main=()->{

            //We can use variables from current method and also out of the method in lambda expression
            System.out.println(i);
            System.out.println(j);

            //We can change value of variables which are not belong to current method
            i=20;

            //We cannot change value of variables which are belong to current method
            //Because current method's variable must be final or effectively final
            //Remove comment to check
            //j=30;
        };
    }
}
