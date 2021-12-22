package dev.practice.enums;

public class Main {

    public static void main(String[] args) {

        //Here we call constant by class name because thy are static
        //Here in println() method the name of constant will be print because enums override toString() method
        System.out.println(Enums.FIRSTNAME);
        System.out.println(Enums.LASTNAME);
        System.out.println(Enums.AGE);

        //also we can make an array of constants
        Enums[] enums=Enums.values();
        for (Enums enums1:enums) {
            System.out.println(enums1);

            //ordinal() method gives a position of constant in enum
            System.out.println(enums1.ordinal());

            //values of constants
            System.out.println(enums1.getI());
        }
    }
}
