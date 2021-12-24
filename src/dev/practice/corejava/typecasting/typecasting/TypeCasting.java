package dev.practice.corejava.typecasting.typecasting;

import dev.practice.corejava.exampleofencapsulation.CoreJavaDao;

public class TypeCasting {
    public static void main(String[] args) {

        CoreJavaDao coreJavaDao=new CoreJavaDao();
        //Primitive types
        coreJavaDao.setB((byte)0);
        coreJavaDao.setC('a');
        coreJavaDao.setI(1);
        coreJavaDao.setL(2);
        coreJavaDao.setF(0.1f);
        coreJavaDao.setD(0.6);

        //implicit type casting
        coreJavaDao.setI(coreJavaDao.getB());
        System.out.println("b->i"+coreJavaDao.getI());
        coreJavaDao.setB((byte)0);coreJavaDao.setC('a');coreJavaDao.setI(1);coreJavaDao.setL(2);coreJavaDao.setF(0.1f);coreJavaDao.setD(0.6);

        coreJavaDao.setI(coreJavaDao.getC());
        System.out.println("c->i"+coreJavaDao.getI());
        coreJavaDao.setB((byte)0);coreJavaDao.setC('a');coreJavaDao.setI(1);coreJavaDao.setL(2);coreJavaDao.setF(0.1f);coreJavaDao.setD(0.6);

        coreJavaDao.setL(coreJavaDao.getB());
        System.out.println("b->l"+coreJavaDao.getL());
        coreJavaDao.setB((byte)0);coreJavaDao.setC('a');coreJavaDao.setI(1);coreJavaDao.setL(2);coreJavaDao.setF(0.1f);coreJavaDao.setD(0.6);

        //explicit type casting
        coreJavaDao.setB((byte)coreJavaDao.getI());
        System.out.println("i->b"+coreJavaDao.getB());
        coreJavaDao.setB((byte)0);coreJavaDao.setC('a');coreJavaDao.setI(1);coreJavaDao.setL(2);coreJavaDao.setF(0.1f);coreJavaDao.setD(0.6);

    }
}
