package dev.practice.typecasting.typecastingbeyondlimit;

import dev.practice.corejavadao.exampleofencapsulation.CoreJavaDao;

public class TypeCastingBeyondLimit {
    public static void main(String[] args) {

        CoreJavaDao coreJavaDao=new CoreJavaDao();
        coreJavaDao.setI(130);
        coreJavaDao.setI1(612);
        coreJavaDao.setB((byte)1);
        coreJavaDao.setC('a');

        //explicit type cast beyond the limit
        coreJavaDao.setB((byte)coreJavaDao.getI());//byte limits are -128 to 127// so after 127 it takes minus values starts by -128,-127,-126,.....
        System.out.println(coreJavaDao.getB());
        coreJavaDao.setB((byte)coreJavaDao.getI1());//byte limits are -128 to 127// so after 127 it takes minus values starts by -128,-127,-126,.....,0,1,2,3,...,-128,-127,...//this cycle remain continue
        System.out.println(coreJavaDao.getB());
        coreJavaDao.setC((char)coreJavaDao.getI());
        System.out.println(coreJavaDao.getC());
        coreJavaDao.setC((char)coreJavaDao.getI1());//char length is 256// so after 256 it takes 0,1,2,3,...,255,0,1,2,...//this cycle remain continue
        System.out.println(coreJavaDao.getC());
    }
}
