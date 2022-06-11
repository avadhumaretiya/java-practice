package dev.practice.java8.lambdaexpression.lambdaexpressionwitharguments;

public class Child implements FunctionalInterfaceWithargument {

    @Override
    public void m1(int a,int b) {
        System.out.println("Sum is:"+(a+b));
    }
}
