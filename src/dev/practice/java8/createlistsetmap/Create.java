package dev.practice.java8.createlistsetmap;

import dev.practice.java8.dao.Dao;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Create {

    public static ArrayList createArrayListInteger(){

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add(50);
        arrayList.add(20);
        arrayList.add(5);
        arrayList.add(30);
        return arrayList;
    }

    public static ArrayList createArrayListString(){

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("7SPAN");
        arrayList.add("avadh");
        arrayList.add("7span");
        arrayList.add("&span");
        arrayList.add("umretiya");
        arrayList.add("&SPAN");
        return arrayList;
    }

    public static TreeSet createTreeSetInteger(){

        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(30);
        return treeSet;
    }

    public static TreeSet createTreeSetIntegerWithLambda(){

        //Lambda expression for descending order with conditional operator
        TreeSet<Integer> treeSet=new TreeSet<>((i1,i2)->i1<i2?1:i1>i2?-1:0);
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(30);
        return treeSet;
    }

    public static TreeSet createTreeSetString(){

        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("7SPAN");
        treeSet.add("avadh");
        treeSet.add("7span");
        treeSet.add("&span");
        treeSet.add("umretiya");
        treeSet.add("&SPAN");
        return treeSet;
    }

    public static TreeMap createTreeMapInteger(){

        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(20,"7SPAN");
        treeMap.put(10,"avadh");
        treeMap.put(50,"7span");
        treeMap.put(20,"&span");
        treeMap.put(40,"umretiya");
        treeMap.put(30,"&SPAN");
        return treeMap;
    }

    public static TreeMap createTreeMapIntegerWithLambda(){

        //Lambda expression for descending order by key
        TreeMap<Integer,String> treeMap=new TreeMap<>((i1,i2)->i1<i2?1:i1>i2?-1:0);
        treeMap.put(20,"7SPAN");
        treeMap.put(10,"avadh");
        treeMap.put(50,"7span");
        treeMap.put(20,"&span");
        treeMap.put(40,"umretiya");
        treeMap.put(30,"&SPAN");
        return treeMap;
    }

    public static ArrayList createDaoList(){

        ArrayList<Dao> arrayList=new ArrayList<>();
        arrayList.add(new Dao(300,"7span","owner"));
        arrayList.add(new Dao(100,"avadh","developer"));
        arrayList.add(new Dao(400,"akshay","lead"));
        arrayList.add(new Dao(200,"hetvi","developer"));
        return arrayList;
    }
}
