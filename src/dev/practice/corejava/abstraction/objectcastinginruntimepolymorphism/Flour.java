package dev.practice.corejava.abstraction.objectcastinginruntimepolymorphism;

class Flour implements Product {

    @Override
    public int dispatch() {
        int dispatchQuantity=5;
        return dispatchQuantity;
    }

    @Override
    public String manufacture() {
        String s="Manufacture product";
        return s;
    }
}
