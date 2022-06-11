package dev.practice.corejava.collections.randomclass;

import java.util.Random;

public class RandomClass {

    public int getRandoNumber(){

        int random=0;

        //Create Random class object
        Random random1=new Random();

        //Get random value by using nextValue() method
        random=random1.nextInt();

        return random;
    }

    public  int getOTP(){

        int otp=0;

        //Create Random class object
        Random random1=new Random();

        //Get random value by using nextValue() method with our requirement of range
        //Simply pass range in argument
        otp=random1.nextInt(999999);

        return otp;
    }
}
