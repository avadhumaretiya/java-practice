package dev.practice.corejava.abstraction.basicabstraction;

public class Main {

    public static void main(String[] args) {
        //cannot create an instance of abstract class and abstract child class
        //Project project=new Project();
        //Manager manager=new Manager();

        //Need to create an instance of none abstract child class
        Employee employee=new Employee();
        String s=employee.employee();
        System.out.println(s);
        String s1=employee.manager();
        System.out.println(s1);
    }
}
