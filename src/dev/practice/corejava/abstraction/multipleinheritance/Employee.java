package dev.practice.corejava.abstraction.multipleinheritance;

class Employee implements Manager,Project{

    @Override
    public String manager() {
        String s="Manager Name";
        return s;
    }

    @Override
    public String salary() {
        String s="Salary";
        return s;
    }

    @Override
    public String employee() {
        String s="Employee Name";
        return s;
    }
}
