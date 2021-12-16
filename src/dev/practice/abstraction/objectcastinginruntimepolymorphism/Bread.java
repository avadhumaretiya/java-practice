package dev.practice.abstraction.objectcastinginruntimepolymorphism;

class Bread extends Flour {

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
