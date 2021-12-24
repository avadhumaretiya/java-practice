package dev.practice.corejava.innerclasses.staticinnerstaticmembers;

//Outer Class
public class StaticInnerStaticMembers {

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
            System.out.println("Inner class");
            return l;
        }
    }

    public static void main(String[] args) {

        //call outer class members
        int a=StaticInnerStaticMembers.i;
        int b=StaticInnerStaticMembers.outerClassMethod();

        //call inner class members
        int c= StaticInnerStaticMembers.InnerClass.k;
        int d=StaticInnerStaticMembers.InnerClass.innerClassMethod();

        //Also inner class members called directly by only Inner class name
        c=InnerClass.k;
        d=InnerClass.innerClassMethod();

    }
}
