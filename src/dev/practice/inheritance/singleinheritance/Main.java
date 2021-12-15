package dev.practice.inheritance.singleinheritance;

public class Main {
    public static void main(String[] args) {

        Child child = new Child();

        //call own method
        String s=child.animal();

        //call parent class method
        String s1=child.car();

        Parent parent=new Parent();

        //call parent class method
        String s3=parent.animal();

        int i=child.i;
        System.out.println(i);
        int j= parent.i;
        System.out.println(j);


    }
}
