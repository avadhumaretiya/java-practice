package dev.practice.corejava.objectclassmethods.tostringmethod;

import dev.practice.corejava.exampleofencapsulation.StringDao;

public class ToStringMethod {

    public static void main(String[] args) {

        StringDao stringDao=new StringDao();
        stringDao.setFirstName("Avadh");
        stringDao.setLastName("Umretiya");
        System.out.println(stringDao);
    }

}
