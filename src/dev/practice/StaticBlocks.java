package dev.practice;

public class StaticBlocks {

    //more than one static blocks can be created
    //static block run for first when class is loaded
    public static void main(String[] args){
        System.out.println("main method call");
    }
    static{
        System.out.println("Static Block 1 call");
    }
    static {
        System.out.println("Static Block 2 call");
    }
}
