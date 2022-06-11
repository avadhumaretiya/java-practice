package dev.practice.java8.predefinedfunctionalinterfaces.consumer.consumerwithownobject;

import dev.practice.java8.dao.Dao;
import dev.practice.java8.predefinedfunctionalinterfaces.predicate.getbydesignation.PredicateWithObject;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerWithOwnObject {

    public static void main(String[] args) {

        //We create an arraylist of dao class
        ArrayList<Dao> arrayList=PredicateWithObject.createDaoObjectList();

        //Print all the values of dao with consumer
        Consumer<Dao> consumer=dao -> {
          System.out.println(dao.getName());
          System.out.println(dao.getDesignation());
          System.out.println(dao.getSalary());
          System.out.println(dao.getLocation());
        };

        //Iterate arraylist and pass dao object in accept() method
        for (Dao dao:arrayList){
            consumer.accept(dao);
        }
    }
}
