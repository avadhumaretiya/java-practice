package dev.practice.wrapperclass;

import dev.practice.corejavadao.exampleofencapsulation.CoreJavaDao;

public class BoxingUnboxing {
    public static void main(String[] args) {

        CoreJavaDao coreJavaDao=new CoreJavaDao();
        //Boxing(Primitive to Object)
        coreJavaDao.setI(100);
        coreJavaDao.setInteger(Integer.valueOf(coreJavaDao.getI()));
        System.out.println("Boxing "+coreJavaDao.getInteger());

        //Unboxing(Object to Primitive)
        coreJavaDao.setI(coreJavaDao.getInteger().intValue());
        System.out.println("Unboxing "+coreJavaDao.getI());

        //This two methods valueof() and intValue() both are same for every wrapper class of primitive types
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
