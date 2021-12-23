package dev.practice.maps.weakhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Check with HashMap and WeakHashMap
        Map<WeakHashMaps,String> weakHashMapsStringMap=new WeakHashMap<>();

        WeakHashMaps weakHashMaps=new WeakHashMaps();
        weakHashMapsStringMap.put(weakHashMaps,"avadh");

        System.out.println(weakHashMapsStringMap);
        weakHashMaps=null;

        //If we create hashMap then here garbage collection not happens because hashmap holds the class object
        //But if we create the WeakHashMap then finalize method called for garbage collection
        System.gc();
        Thread.sleep(5000);

        System.out.println(weakHashMapsStringMap);

    }
}
