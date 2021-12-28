package dev.practice.java8.predefinedfunctionalinterfaces.predicate.removenullfromstring;

import java.util.function.Predicate;

public class RemoveNullFromString {

    public static void main(String[] args) {

        String[] s={"avadh",null,"akshay","","7SPAN"};

        //make Predicate to check if value is null or not
        Predicate<String> predicate=a->(a!=null&&a.length()!=0);

        for(String s1:s){
            if(predicate.test(s1)){
                System.out.println(s1);
            }
        }
    }
}
