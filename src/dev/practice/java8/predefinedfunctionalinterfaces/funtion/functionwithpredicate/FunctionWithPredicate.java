package dev.practice.java8.predefinedfunctionalinterfaces.funtion.functionwithpredicate;

import dev.practice.java8.dao.Dao;
import dev.practice.java8.predefinedfunctionalinterfaces.predicate.getbydesignation.PredicateWithObject;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionWithPredicate {

    public static void createFunction(){

        //Create function to check salary
        Function<Dao,String> function= dao -> {

            if(dao.getSalary()<=15000){
                return "low";
            }else if(dao.getSalary()<=20000){
                return "normal";
            }else if(dao.getSalary()<=50000){
                return "good";
            }else if(dao.getSalary()>=100000){
                return "better";
            }
            return null;
        };

        display(function, PredicateWithObject.createDaoObjectList());
    }

    public static void display(Function<Dao,String> function, ArrayList<Dao> arrayList){

        for(Dao dao:arrayList){

            //Check if predicate true then execute function
            if(createPredicate().test(dao)) {
                System.out.println(dao);
                System.out.println(function.apply(dao));
            }
        }
    }

    public static Predicate createPredicate(){

        Predicate<Dao> predicate=dao -> dao.getSalary()>20000;
        return predicate;
    }
}
