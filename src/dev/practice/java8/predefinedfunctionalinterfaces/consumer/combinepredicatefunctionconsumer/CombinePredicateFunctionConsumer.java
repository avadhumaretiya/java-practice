package dev.practice.java8.predefinedfunctionalinterfaces.consumer.combinepredicatefunctionconsumer;

import dev.practice.java8.dao.Dao;
import dev.practice.java8.predefinedfunctionalinterfaces.predicate.getbydesignation.PredicateWithObject;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class CombinePredicateFunctionConsumer {

    public static void createFunction(){

        Function<Dao,String> function=dao -> {

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

        display(createConsumer(function),PredicateWithObject.createDaoObjectList());
    }

    public static Predicate createPredicate(){

        Predicate<Dao> predicate=dao -> dao.getSalary()<=20000;
        return predicate;
    }

    public static Consumer createConsumer(Function<Dao,String> function){

        Consumer<Dao> consumer=dao -> {
            System.out.println(function.apply(dao));
            System.out.println(dao);
        };

        return consumer;
    }

    public static void display(Consumer<Dao> consumer, ArrayList<Dao> arrayList){

        for(Dao dao:arrayList){
            if(createPredicate().test(dao)){
                consumer.accept(dao);
            }
        }
    }
}
