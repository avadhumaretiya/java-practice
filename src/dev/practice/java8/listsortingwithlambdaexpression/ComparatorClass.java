package dev.practice.java8.listsortingwithlambdaexpression;

import java.util.Comparator;

public class ComparatorClass implements Comparator<Integer> {

    @Override
    public int compare(Integer integer, Integer integer1) {

        return integer<integer1?1:integer>integer1?-1:0;
    }
}
