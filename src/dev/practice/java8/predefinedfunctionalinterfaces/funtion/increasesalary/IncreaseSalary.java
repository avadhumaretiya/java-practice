package dev.practice.java8.predefinedfunctionalinterfaces.funtion.increasesalary;

import dev.practice.java8.dao.Dao;
import dev.practice.java8.predefinedfunctionalinterfaces.predicate.getbydesignation.PredicateWithObject;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class IncreaseSalary {

    public static void createFunction(){

        //Create function to increase salary
        Function<Dao,Dao> function= dao -> {
            dao.setSalary(dao.getSalary()+2000);
            return dao;
        };

        display(function, PredicateWithObject.createDaoObjectList());
    }

    public static void display(Function<Dao,Dao> function, ArrayList<Dao> arrayList){

        for(Dao dao:arrayList){

            //Check if predicate true then execute function
            if(createPredicate().test(dao)) {
                System.out.println(function.apply(dao));
            }
        }
    }

    public static Predicate createPredicate(){

        Predicate<Dao> predicate=dao -> dao.getSalary()<=20000;
        return predicate;
    }
}
