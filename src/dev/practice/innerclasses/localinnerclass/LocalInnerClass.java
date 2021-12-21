package dev.practice.innerclasses.localinnerclass;

public class LocalInnerClass {

    //Outer class members
    void outerClassMethod(){
        String s1= "Outer class Method";

        //Create Class Inside the Method of Outside Class
        //Cannot be access outside from the method
        //Cannot use any access modifiers with class except "Default"
        //Static keyword not possible here
        //Final and Abstract Keywords are possible here
        class LocalInner{

            //Local Inner Class Members
             String s2="Local Inner Class Variable";

            String localInnerClassMethod(){
                 String s3="Local Inner Class Method";
                 return s3;
            }
        }

        //Create an object of Local Inner Class
        LocalInner localInner=new LocalInner();
        localInner.localInnerClassMethod();

        //Call outer class members
        System.out.println(s1);

        //Call local inner class members
        System.out.println(localInner.s2);
        System.out.println(localInner.localInnerClassMethod());
    }

    public static void main(String[] args) {

        //Create an object of Outer class
        LocalInnerClass localInnerClass=new LocalInnerClass();

        //Call the method of outer class which contains the Local inner class
        localInnerClass.outerClassMethod();
    }
}
