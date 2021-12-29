package dev.practice.java8.predefinedfunctionalinterfaces.predicate.getbydesignation;

import dev.practice.java8.dao.Dao;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateWithObject {

    public static ArrayList createDaoObjectList(){

        ArrayList<Dao> arrayList=new ArrayList<>();
        arrayList.add(new Dao("avadh","developer",15000,"ahmedabad"));
        arrayList.add(new Dao("hetvi","manager",30000,"rajkot"));
        arrayList.add(new Dao("akshay","leader",100000,"ahmedabad"));
        arrayList.add(new Dao("jay","manager",50000,"navsari"));
        arrayList.add(new Dao("hardik","developer",20000,"navsari"));
        return  arrayList;
    }

    public static void operations(){

        //Here we create a predicate to get objects which contains designation as a manager
        Predicate<Dao> predicate=dao -> dao.getDesignation().equals("manager");
        PredicateWithObject.display(predicate, PredicateWithObject.createDaoObjectList());
        System.out.println();

        //Here we create a predicate to get objects which contains location as an ahmedabad
        Predicate<Dao> predicate1=dao -> dao.getLocation().equals("rajkot");
        PredicateWithObject.display(predicate1, PredicateWithObject.createDaoObjectList());
        System.out.println();

        //Here we create a predicate to get objects which contains salary less than 20000
        Predicate<Dao> predicate2=dao -> dao.getSalary()<=20000;
        PredicateWithObject.display(predicate2, PredicateWithObject.createDaoObjectList());
        System.out.println();

        //Join two predicate
        //Here we use a predicate and() method to get objects which contains designation as a developer and location as a rajkot
        PredicateWithObject.display(predicate.and(predicate1), PredicateWithObject.createDaoObjectList());
        System.out.println();

        //Here we use a predicate or() method to get objects which contains designation as a developer or location as a rajkot
        PredicateWithObject.display(predicate.or(predicate1), PredicateWithObject.createDaoObjectList());
        System.out.println();

        //Here we use a predicate negate() method to get objects which is not contain designation as a developer and location as a rajkot
        PredicateWithObject.display((predicate.and(predicate1)).negate(), PredicateWithObject.createDaoObjectList());
        System.out.println();
    }

    public static void display(Predicate<Dao> predicate,ArrayList<Dao> arrayList){

        for(Dao dao:arrayList){
            if(predicate.test(dao)){
                System.out.println(dao);
            }
        }
    }
}
