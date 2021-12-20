package dev.practice.innerclasses.staticinnernonestaticmembers;

//Outer Class
public class StaticInnerNoneStaticMembers {

    //Outer static members
    static int i=0;
    static int outerClassMethod(){
        int j=i;
        System.out.println("Outer class");
        return j;
    }

    //Inner Static Class
    static class InnerClass{

        //inner static members
        static int k=0;
        static int innerClassMethod(){
            int l=k;
            System.out.println("Inner class static members");
            return l;
        }

        int innerClassMethod1(){
            int l=k;
            System.out.println("Inner class none static members");
            return l;
        }
    }

    public static void main(String[] args) {

        //call outer class members
        int a= StaticInnerNoneStaticMembers.i;
        int b= StaticInnerNoneStaticMembers.outerClassMethod();

        //call inner class members
        StaticInnerNoneStaticMembers.InnerClass innerClass=new StaticInnerNoneStaticMembers.InnerClass();
        int d= innerClass.innerClassMethod1();

        //Also inner class members called directly by only Inner class object
        InnerClass innerClass1=new InnerClass();
        d= innerClass1.innerClassMethod1();
    }
}
