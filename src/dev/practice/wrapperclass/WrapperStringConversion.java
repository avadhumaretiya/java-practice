package dev.practice.wrapperclass;

import dev.practice.corejavadao.exampleofencapsulation.CoreJavaDao;

public class WrapperStringConversion {
    public static void main(String[] args) {

        CoreJavaDao coreJavaDao=new CoreJavaDao();
        //Convert Wrapper to String
        coreJavaDao.setI(100);
        coreJavaDao.setInteger(Integer.valueOf(coreJavaDao.getI()));
        coreJavaDao.setString(coreJavaDao.getInteger().toString());
        System.out.println("Wrapper to String "+coreJavaDao.getString());

        //Convert String to Wrapper
        coreJavaDao.setInteger(Integer.valueOf(coreJavaDao.getString()));
        System.out.println("String to Wrapper "+coreJavaDao.getInteger());
    }
}
