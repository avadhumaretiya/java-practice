package dev.practice.corejava.maps.identityhashmap;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        IdentityHashMaps identityHashMaps=new IdentityHashMaps();
        Map map=identityHashMaps.createMap();

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
