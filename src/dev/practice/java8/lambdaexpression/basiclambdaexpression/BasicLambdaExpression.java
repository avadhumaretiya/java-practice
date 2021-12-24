package dev.practice.java8.lambdaexpression.basiclambdaexpression;

public class BasicLambdaExpression {

    public static void main(String[] args) {

        //Call method using Lambda expression
        //No need to implement interface
        BasicFunctionalInterface basicFunctionalInterface=()->System.out.println("Functional Interface Method");
        basicFunctionalInterface.m1();
    }
}
