package dev.practice.java8.lambdaexpression.squarewithlambdaexpression;

public class LambdaExpressionSquare {

    public static void main(String[] args) {

        //Finding square
        FuncationalInterfaceSquare funcationalInterfaceSquare = a->a*a;
        System.out.println(funcationalInterfaceSquare.m1(5));
    }
}
