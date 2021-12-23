package dev.practice.maps.hashmap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        HashMaps hashMaps=new HashMaps();
        Map map=hashMaps.createMap();

        //Get key in set
        Set<String> key=map.keySet();
        System.out.println(key);

        //Get value in collection
        Collection<Integer> value=map.values();
        System.out.println(value);

        //get key and value both
        for(String keys:key){
            System.out.println("key:"+keys+" value:"+map.get(keys));
        }
    }
}
