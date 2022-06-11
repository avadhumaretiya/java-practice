package dev.practice.java8.predefinedfunctionalinterfaces.supplier.randomstringwithsupplier;

import java.util.function.Supplier;

public class RandomStringWithSupplier {

    public static Supplier createSupplier() {

        Supplier<String> supplier=()->{

            String s[]={"avadh","7span","umretiya","&span"};

            //This will give random number between 0 to 3
            //Math.random() gives random number between 0 to 0.999
            //So 0*4=0 and 0.999*4=3.6
            //We are type casting here//so we get minimum 0 and maximum 3
            int i=(int)(Math.random()*4);
            System.out.println(i);
            return s[i];
        };
        return supplier;
    }
}
