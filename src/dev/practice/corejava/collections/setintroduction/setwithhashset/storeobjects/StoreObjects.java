package dev.practice.corejava.collections.setintroduction.setwithhashset.storeobjects;

import dev.practice.corejava.collections.setintroduction.storeobjectsdao.StoreObjectsDao;

import java.util.HashSet;

public class StoreObjects {

    public static void main(String[] args) {

        StoreObjectsDao storeObjectsDao=new StoreObjectsDao(101,"avadh","umretiya",false);

        //HashSet works with two methods to compare values for store unique values
        //equals() and hashCode() method
        HashSet<StoreObjectsDao> hashSet=new HashSet<>();
        //Here we insert 4 different objects//So all the objects have different hashCode() and same value
        //So they store with different position in hashSet
        hashSet.add(new StoreObjectsDao(101,"avadh","umretiya",false));
        hashSet.add(new StoreObjectsDao(101,"avadh","umretiya",false));
        hashSet.add(new StoreObjectsDao(101,"avadh","umretiya",false));
        hashSet.add(new StoreObjectsDao(101,"avadh","umretiya",false));

        //Here we insert 4 same objects//So all the objects have same hashCode()
        //So this override the values
        hashSet.add(storeObjectsDao);
        storeObjectsDao.setId(111);
        hashSet.add(storeObjectsDao);
        storeObjectsDao.setName("7span");
        hashSet.add(storeObjectsDao);
        storeObjectsDao.setSurname("span");
        hashSet.add(storeObjectsDao);

        for(StoreObjectsDao storeObjectsDao1:hashSet) {
            System.out.println(storeObjectsDao1);
        }

        //Print values
        System.out.println(storeObjectsDao.getId());
        System.out.println(storeObjectsDao.getName());
        System.out.println(storeObjectsDao.getSurname());
    }
}
