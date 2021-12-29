package dev.practice.java8.predefinedfunctionalinterfaces.bifunction.usetwoownclassobjectinbifunction;

import dev.practice.java8.dao.Dao;

import java.util.function.BiFunction;

public class UseTwoClassObjectInbiFunction {

    public static void main(String[] args) {

        //Here we give Dao and IncreaseSalaryDao object as an input types and integer as a return type
        BiFunction<Dao,IncreaseSalaryDao,Integer> biFunction=(dao, increaseSalaryDao) -> {
            dao.setSalary(dao.getSalary()+increaseSalaryDao.getIncrement());
            return dao.getSalary();
        };

        Dao dao=new Dao("avadh","developer",15000,"ahmedabad");
        IncreaseSalaryDao increaseSalaryDao=new IncreaseSalaryDao(2000);

        //We use an apply() method to get return value
        System.out.println(biFunction.apply(dao,increaseSalaryDao));


    }
}