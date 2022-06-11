package dev.practice.java8.predefinedfunctionalinterfaces.funtion.functionchaining.functionchainingwithownobject;

import dev.practice.java8.dao.Dao;
import dev.practice.java8.predefinedfunctionalinterfaces.predicate.getbydesignation.PredicateWithObject;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionChaining {

    public static Function createFunction(){

        //Create function to check salary
        Function<Dao,Dao> function= dao -> {

            System.out.println("Function one execute");
            if(dao.getSalary()<=15000){
                return dao;
            }else if(dao.getSalary()<=20000){
                return dao;
            }else if(dao.getSalary()<=50000){
                return dao;
            }else if(dao.getSalary()>=100000){
                return dao;
            }
            return dao;
        };
        return function;
    }

    public static Function createFunction1(){

        //Create function to increase salary
        Function<Dao,Dao> function= dao -> {
            System.out.println("Function two execute");
            dao.setSalary(dao.getSalary()+2000);
            return dao;
        };
        return function;
    }

    public static Predicate createPredicate1(){

        Predicate<Dao> predicate=dao -> dao.getSalary() >=20000;
        return predicate;
    }

    //Here we are creating function chaining
    public static void functionChaining(){

        //Here we are using andThen() method
        //So first createFunction() function execute and then createFunction1() execute
        Function function=createFunction().andThen(createFunction1());

        //Here we are using compose() method
        //So first createFunction1() function execute and then createFunction() execute
        Function function1=createFunction().compose(createFunction1());

        //Here we can check function execution sequence
        display(function1,PredicateWithObject.createDaoObjectList());
        System.out.println();
        display(function,PredicateWithObject.createDaoObjectList());
    }

    public static void display(Function function, ArrayList<Dao> arrayList){

        for(Dao dao:arrayList){

            //Check if predicate true then execute function
            if(createPredicate1().test(dao)) {
                System.out.println(function.apply(dao));
            }
        }
    }
}
