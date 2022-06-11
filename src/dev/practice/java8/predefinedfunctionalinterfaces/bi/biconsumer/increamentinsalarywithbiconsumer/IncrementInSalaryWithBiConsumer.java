package dev.practice.java8.predefinedfunctionalinterfaces.bi.biconsumer.increamentinsalarywithbiconsumer;

import dev.practice.java8.dao.Dao;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class IncrementInSalaryWithBiConsumer {

        public static void createFuncction(){


            //Create biFunction to create an arraylist of dao objects
            BiFunction<String,Integer,Dao> function=(name,salary)->new Dao(name,salary);

            ArrayList<Dao> arrayList=new ArrayList<>();
            arrayList.add(function.apply("avadh",15000));
            arrayList.add(function.apply("hardik",20000));
            arrayList.add(function.apply("hetvi",25000));

            display(createConsumer(),arrayList);
        }

        public static BiConsumer<Dao, Integer> createConsumer(){

            //Create BiConsumer to perform sum of salary and increment
            BiConsumer<Dao,Integer> consumer=(dao, integer) -> dao.setSalary(dao.getSalary()+integer);
            return consumer;
        }

        public static void display(BiConsumer<Dao,Integer> biConsumer, ArrayList<Dao> arrayList){

            //BiConsumer accept() method
            for (Dao dao:arrayList){
                biConsumer.accept(dao,2000);
            }

            for(Dao dao:arrayList){
                System.out.println(dao.getName());
                System.out.println(dao.getSalary());
            }
        }
}
