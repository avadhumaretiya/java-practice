package dev.practice.java8.predefinedfunctionalinterfaces.supplier.basicsupplier;

import java.util.Date;
import java.util.function.Supplier;

public class BasicSupplier {

    public static void main(String[] args) {

        //Create a supplier to get date
        //Supplier only take return type
        //Supplier only return value//It doesn't take anything
        //Here "Date" is a return type
        Supplier<Date> supplier=()->new Date();

        //we use get() method to get date
        System.out.println(supplier.get());
    }
}
