package dev.practice.abstraction.objectcastinginruntimepolymorphism;

public class Main {

    public static void main(String[] args) {

        //Runtime Polymorphism//Runtime Object Biding
        //Child to Parent Casting//Which is Implicit Casting
        Product product=new Bread();
        Product product1=new Flour();

        //Call methods by using interface object with reference of child class
        int i=product.dispatch();
        String s=product.manufacture();
        System.out.println(i+" "+s);

        //Call methods by using interface object with reference of child class
        int i1=product1.dispatch();
        String s1=product1.manufacture();
        System.out.println(i+" "+s);

        //Parent to Child Casting//Which is Explicit Casting
        Bread bread=(Bread) product;
        Flour flour=(Flour) product;

        //Call methods by suing child class object with reference of Interface
        System.out.println(bread.dispatch());
        System.out.println(bread.manufacture());

        //Call methods by suing child class object with reference of Interface
        System.out.println(flour.dispatch());
        System.out.println(flour.manufacture());
    }
}
