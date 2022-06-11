package dev.practice.corejava.abstraction.multipleinheritance;

public class Main {

    public static void main(String[] args) {
        Employee employee=new Employee();

        //call method which is same in both interfaces
        String s=employee.manager();
        System.out.println(s);

        //call methods which are different in both interfaces
        String s1=employee.employee();
        System.out.println(s1);
        String s2=employee.salary();
        System.out.println(s2);
    }
}
