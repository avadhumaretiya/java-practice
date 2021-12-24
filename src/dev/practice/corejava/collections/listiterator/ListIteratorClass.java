package dev.practice.corejava.collections.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListIteratorClass {

    public List getRandomListWithLimitOf10(){

        List<Integer> list=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<10;i++){
            list.add(random.nextInt(10));
        }
        return list;
    }

    public List getRandomListWithLimitOf100(){

        List<Integer> list=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<10;i++){
            list.add(random.nextInt(100));
        }
        return list;
    }
}
