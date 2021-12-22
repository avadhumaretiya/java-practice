package dev.practice.objectclassmethods.equalsmethod;

import dev.practice.corejavadao.exampleofencapsulation.StringDao;

public class EqualsMethod {

    public static void main(String[] args) {

        //First object of class with set all the values of all variables
        StringDao stringDao=new StringDao();
        stringDao.setId(1);
        stringDao.setFirstName("Avadh");
        stringDao.setLastName("Umretiya");

        //Second object of class with set all the values of all variables
        //One value is different from first object
        StringDao stringDao1=new StringDao();
        stringDao1.setId(2);
        stringDao1.setFirstName("Avadh");
        stringDao1.setLastName("Umretiya");

        //So here we are getting output false
        System.out.println(stringDao.equals(stringDao1));

        //Third object of class with set all the values of all variables
        //All values are same as First object
        StringDao stringDao2=new StringDao();
        stringDao2.setId(1);
        stringDao2.setFirstName("Avadh");
        stringDao2.setLastName("Umretiya");

        //So here we are getting output true
        System.out.println(stringDao.equals(stringDao2));

    }
}
