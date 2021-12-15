package dev.practice.staticnonstatic.staticnonstaticblocks;

public class StaticNonStaticBlocks {

    StaticNonStaticBlocks(){
        System.out.println("Constructor");
    }

    //none static block
    {
        System.out.println("Non Static Block");
    }

    //static block
    static{
        System.out.println("Static Block");
    }

    public static void main(String[] args){
        System.out.println("Main method");

        //static block run only once when class loaded
        //but none static block and constructor run everytime when we create an instance
        new StaticNonStaticBlocks();
        new StaticNonStaticBlocks();
        new StaticNonStaticBlocks();
    }
}
