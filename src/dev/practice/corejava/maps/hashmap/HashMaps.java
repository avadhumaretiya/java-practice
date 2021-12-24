package dev.practice.corejava.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public Map createMap(){

        //Here we create a hashMap with String key and Integer Value
        //Map contains key and value format
        //Where keys are in set and values are in collection
        Map<String,Integer> map=new HashMap<>();

        //if we are adding three different object but same value then it is override the previous value
        //because it uses .equals() method to compare
        String s=new String("abc");
        String s1=new String("abc");
        map.put(s, 100);
        map.put(s1, 200);
        map.put("avadh",300);
        map.put("blackmonn",200);
        map.put("span",400);
        map.put("7span",300);

        return map;

    }
}
