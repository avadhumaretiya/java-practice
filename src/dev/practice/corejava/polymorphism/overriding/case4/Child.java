package dev.practice.corejava.polymorphism.overriding.case4;

class Child extends Parent{

    /*Parent method(final), Child method(no-final)*/
    /*public void finalCannotOverride(){
        System.out.println("Call Child class method");
    }*/

    /*Parent method(no-final), Child method(final)*/
    public final void finalCanOverride(){
        System.out.println("Call Child class method");
    }


}
