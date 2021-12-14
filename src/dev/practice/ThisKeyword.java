package dev.practice;

public class ThisKeyword {

    int i;

    //"this" keyword cannot be used in static context or main method
    //"this" keyword can be used in none static context
    ThisKeyword(){
        System.out.println(this);
        System.out.println(this.i);
    }

    public static void main(String[] args){
        new ThisKeyword();
        new ThisKeyword();
    }
}
