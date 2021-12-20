package dev.practice.innerclasses.outerclassmembersininnerclass;

//outer class
public class OuterClassMembersInInnerClass {

    //Outer static members
    private static String s="outer class static variable";

    //outer none static members
    private String s1="outer class none static variable";
    String outerClassNoneStaticMethod(){
        String s2="Outer class none static method";
        return s2;
    }

    //Inner Class
    class InnerClass{

        //call outer class statiuc members in inner class
         String s=OuterClassMembersInInnerClass.s;

         //call outer class none static members
         String s1=OuterClassMembersInInnerClass.this.s1;
         String s2=OuterClassMembersInInnerClass.this.outerClassNoneStaticMethod();
    }

    public static void main(String[] args) {

        OuterClassMembersInInnerClass outerClassMembersInInnerClass=new OuterClassMembersInInnerClass();

        //call inner class members
        OuterClassMembersInInnerClass.InnerClass innerClass=outerClassMembersInInnerClass.new InnerClass();
        System.out.println(innerClass.s);
        System.out.println(innerClass.s1);
        System.out.println(innerClass.s2);
    }
}
