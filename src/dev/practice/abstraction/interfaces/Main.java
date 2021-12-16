package dev.practice.abstraction.interfaces;

public class Main {

    public static void main(String[] args) {
        //create an instance of implemented class
        Employee employee = new Employee();
        String s=employee.employee();
        System.out.println(s);
        String s1=employee.manager();
        System.out.println(s1);

        //variables call by class name because they are static by default
        int i=Employee.i;
        System.out.println(i);
    }
}
