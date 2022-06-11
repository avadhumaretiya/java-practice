package dev.practice.java8.predefinedfunctionalinterfaces.predicate.isequalmethod;

import dev.practice.java8.dao.Dao;

import java.util.function.Predicate;

public class IsEqualMethod {

    public static void main(String[] args) {

        //isEqual() method of Predicate
        Predicate<String> predicate= Predicate.isEqual("avadh");
        System.out.println(predicate.test("avadh"));
        System.out.println(predicate.test("7span"));
        System.out.println();

        //isEqual() method of Predicate with object
        Predicate<Dao> predicate1=Predicate.isEqual(new Dao("avadh","developer",20000,"ahmedabad"));
        Dao dao=new Dao("avadh","developer",20000,"ahmedabad");
        Dao dao1=new Dao("avadh","manager",20000,"ahmedabad");
        System.out.println(predicate1.test(dao));
        System.out.println(predicate1.test(dao1));
    }


}
