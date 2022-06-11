package dev.practice.corejava.innerclasses.nonestaticinnerclass;

//outer class
public class NoneStaticInnerClass {

    //Outer members
    int i=0;
    int outerClassMethod(){
        int j=i;
        System.out.println("Outer class");
        return j;
    }

    //Inner Class
    class InnerClass{

        //inner members
        int k=0;
        int innerClassMethod(){
            int l=k;
            System.out.println("Inner class none static members");
            return l;
        }
    }

    public static void main(String[] args) {

        NoneStaticInnerClass noneStaticInnerClass = new NoneStaticInnerClass();

        //call inner class members
        //Syntax of object declaration of inner class is different here
        //Here object of inner class is created by use of outer class object because main method is static and static only allow to use static members
        NoneStaticInnerClass.InnerClass innerClass = noneStaticInnerClass.new InnerClass();
        int a = innerClass.k;
        int b = innerClass.innerClassMethod();
    }
}
