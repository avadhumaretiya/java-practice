package dev.practice.java8.lambdaexpression.returnvaluewithlambdaexpression;

public class LambdaExpressionWithReturnValue {

    public static void main(String[] args) {

        //Call method with arguments and return value using Lambda expression
        //No need to implement interface
        //No need to provide curly bracket because here we use single line definition
        //No need to provide parenthesis to argument if there is single argument
        //No need to write return statement
        FuncationalInterfaceWithReturnValue funcationalInterfaceWithReturnValue = s->s.length();
        System.out.println(funcationalInterfaceWithReturnValue.m1("7SPAN"));
    }
}
