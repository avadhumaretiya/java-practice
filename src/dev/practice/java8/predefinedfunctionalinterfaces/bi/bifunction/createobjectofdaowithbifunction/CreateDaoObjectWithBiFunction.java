package dev.practice.java8.predefinedfunctionalinterfaces.bi.bifunction.createobjectofdaowithbifunction;

import dev.practice.java8.dao.Dao;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class CreateDaoObjectWithBiFunction {

    public static void main(String[] args) {

        //Here we take Integer and String as a input type and Dao as a return type
        BiFunction<Integer, String, Dao> biFunction = (i, s) -> {
            return new Dao(i, s);
        };

        //Use apply method to get dao object in return
        ArrayList<Dao> arrayList = new ArrayList<>();
        arrayList.add(biFunction.apply(101,"avadh"));
        arrayList.add(biFunction.apply(102,"7span"));
        arrayList.add(biFunction.apply(103,"akshay"));
        arrayList.add(biFunction.apply(104,"hetvi"));

        System.out.println(arrayList);
    }

}
