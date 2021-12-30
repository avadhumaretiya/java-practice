package dev.practice.java8.stream.streamwithownobject;

import dev.practice.java8.dao.Dao;
import dev.practice.java8.predefinedfunctionalinterfaces.predicate.getbydesignation.PredicateWithObject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithOwnObject {

    public static void main(String[] args) {

        ArrayList<Dao> arrayList= PredicateWithObject.createDaoObjectList();

        //This will give whose salary is more than 15000 and location is ahmedabad
        List list=arrayList.stream().filter(dao -> dao.getSalary()>15000&&dao.getLocation().equals("ahmedabad")).collect(Collectors.toList());
        //System.out.println(list);

        //this will give sortedby salary
        List list1=arrayList.stream().sorted(Comparator.comparingInt(dao -> dao.getSalary())).collect(Collectors.toList());
        System.out.println(list1);

        //this will give highest and lowest salary employee
        Dao dao1=arrayList.stream().min(Comparator.comparingInt(dao -> dao.getSalary())).get();
        System.out.println("minimum salary : "+dao1);
        Dao dao2=arrayList.stream().max(Comparator.comparingInt(dao -> dao.getSalary())).get();
        System.out.println("maximum salary : "+dao2);

    }
}
