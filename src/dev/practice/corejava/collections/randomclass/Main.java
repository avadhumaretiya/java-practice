package dev.practice.corejava.collections.randomclass;

public class Main {

    public static void main(String[] args) {

        RandomClass randomClass=new RandomClass();

        //Print random number
        //Everytime we get unique numbers
        System.out.println(randomClass.getRandoNumber());
        System.out.println(randomClass.getRandoNumber());

        //Print OTP//Which is mostly in 6 digits
        //Everytime we get unique OTP
        //This format specifier "%06d" will automatically add 0 in front of string if digits are less than 6
        //Because random gives any number between 0 and 999999
        System.out.println(String.format("%06d",randomClass.getOTP()));
        System.out.println(String.format("%06d",randomClass.getOTP()));
    }
}
