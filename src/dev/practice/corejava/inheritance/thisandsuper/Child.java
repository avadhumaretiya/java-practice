package dev.practice.corejava.inheritance.thisandsuper;

class Child extends Parent{

    String a=null;
    String b=null;
    Child(String a,String b,String c,String d){

        //pass arguments in parent class constructor using super
        super(a,b);
        System.out.println(this.a+", "+this.b);
        this.a=c;
        this.b=d;
        System.out.println(this.a+", "+this.b);
    }
    void Sports(){
        //call method of Parent class using super
        super.car();
        String s="Tennis";
    }
}
