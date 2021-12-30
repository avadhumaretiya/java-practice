package dev.practice.java8.predefinedfunctionalinterfaces.primitive.primitiveconsumer;

import dev.practice.java8.dao.Dao;

import java.util.function.ObjIntConsumer;

public class PrimitiveBiConsumer {

    public static void main(String[] args) {

        //Here we create ObjIntConsumer with take one int and one any object input type
        ObjIntConsumer<Dao> objIntConsumer=(dao, i) ->{
            dao.setSalary(dao.getSalary()+i);
            System.out.println(dao.getSalary());
        };

        objIntConsumer.accept(new Dao("avadh",20000),2000);

        //ObjLongConsumer
        //Which take one Long and one any object input type

        //ObjDoubleConsumer
        //Which take one Double and one any object input type
    }
}
