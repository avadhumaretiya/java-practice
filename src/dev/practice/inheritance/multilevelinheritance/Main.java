package dev.practice.inheritance.multilevelinheritance;

public class Main {

    public static void main(String[] args) {
        ChildChild childChild = new ChildChild();

        //call own method
        String s = childChild.animal();

        //call parent class method
        String s1 = childChild.food();

        //call super parent class method
        String s2=childChild.car();

        Child child=new Child();
        Parent parent = new Parent();

        int i = childChild.i;
        System.out.println(i);
        int j=child.i;
        System.out.println(j);
        int k = parent.i;
        System.out.println(k);
    }
}
