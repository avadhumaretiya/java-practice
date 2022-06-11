package dev.practice.java8.predefinedfunctionalinterfaces.supplier.randomstringwithsupplier;

public class Main {

    public static void main(String[] args) {

        System.out.println(RandomStringWithSupplier.createSupplier().get());
        System.out.println(RandomStringWithSupplier.createSupplier().get());
        System.out.println(RandomStringWithSupplier.createSupplier().get());
        System.out.println(RandomStringWithSupplier.createSupplier().get());
    }
}
