package dev.practice.corejava.wrapperclass;

import dev.practice.corejava.exampleofencapsulation.CoreJavaDao;

public class PrimitiveStringConversion {
    public static void main(String[] args) {

        CoreJavaDao coreJavaDao=new CoreJavaDao();
        //Primitive to String and String to Primitive conversion using wrapper class
        //Convert byte into String with wrapper class
        coreJavaDao.setB((byte)1);
        coreJavaDao.setString(Byte.toString(coreJavaDao.getB()));
        System.out.println("Primitive to String "+coreJavaDao.getString());

        //Convert String to byte with wrapper class
        coreJavaDao.setB(Byte.parseByte(coreJavaDao.getString()));
        System.out.println("String to Primitive "+coreJavaDao.getB());

        //This two methods toString() and parseByte() both are same for every wrapper class of primitive types
        //These are wrapper classes
        //Boolean
        //Byte
        //Short
        //Char
        //Integer
        //Long
        //Float
        //Double
    }
}
