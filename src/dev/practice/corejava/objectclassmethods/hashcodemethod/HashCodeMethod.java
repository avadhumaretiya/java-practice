package dev.practice.corejava.objectclassmethods.hashcodemethod;

import dev.practice.corejava.exampleofencapsulation.StringDao;

public class HashCodeMethod {

    public static void main(String[] args) {

        StringDao stringDao=new StringDao();
        stringDao.setId(5058);
        System.out.println(stringDao.hashCode());
    }
}
