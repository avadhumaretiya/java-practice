package dev.practice.corejava.inheritance.hierarchicalinheritance;

public class Main {

    public static void main(String[] args) {
        Child1 child1 = new Child1();

        //call own method
        String s=child1.animal();

        //call parent class method
        String s1=child1.car();

        Child2 child2 = new Child2();

        //call own method
        String s2=child2.animal();

        //call parent class method
        String s3=child2.car();

        Parent parent=new Parent();

        //call parent class method
        String s4=parent.animal();

        int i=child1.i;
        System.out.println(i);
        int j= child2.i;
        System.out.println(j);
        int k=parent.i;
        System.out.println(k);
    }
}
