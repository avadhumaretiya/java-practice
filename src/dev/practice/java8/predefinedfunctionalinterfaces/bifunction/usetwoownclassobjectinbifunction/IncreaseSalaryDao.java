package dev.practice.java8.predefinedfunctionalinterfaces.bifunction.usetwoownclassobjectinbifunction;

public class IncreaseSalaryDao {

    private int increment;

    public IncreaseSalaryDao(int increment) {
        this.increment = increment;
    }

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }
}
