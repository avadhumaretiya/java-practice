package dev.practice.java8.lambdaexpression.lambdaexpressionwitharguments;

public class LambdaExpressionWithArgument {

    public static void main(String[] args) {

        //Call method with arguments using Lambda expression
        //No need to implement interface
        //Here we do not provide types of arguments "a" and "b"
        //Compiler guess the type from method declaration in interface//It called "type inference"
        //No need to provide curly bracket because here we use single line definition
        FunctionalInterfaceWithargument functionalInterfaceWithargument=(a,b)->System.out.println("Sum is:"+(a+b));
        functionalInterfaceWithargument.m1(100,200);
    }
}
