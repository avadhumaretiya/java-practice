package dev.practice.inheritance.thisandsuper;

class Parent {

    String a=null;
    String b=null;
    Parent(String a,String b){

        System.out.println(this.a+", "+this.b);
        this.a=a;
        this.b=b;
        System.out.println(this.a+", "+this.b);
    }
    void car(){
        String s="Maruti";
    }
}
