package dev.practice.java8.predefinedfunctionalinterfaces.primitive.primitivepredicate;

import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class BasicPrimitivePredicate {

    public static void main(String[] args) {

        //Primitive type array
        int[] i={0,5,10,15,20,25,30,35};
        long[] l={10000000,2333329,24235253,2353554,5525251};

        //Create primitive type predicate int
        //It only take int type argument
        IntPredicate intPredicate=j->j%2==0;

        //Create primitive type predicate long
        //It only take long type argument
        LongPredicate longPredicate=k->k%2==0;

        for(int a:i){

            //test method of primitive predicate int
            if(intPredicate.test(a)){
                System.out.println(a);
            }
        }

        for(long b:l){

            //test method of primitive predicate long
            if(longPredicate.test(b)){
                System.out.println(b);
            }
        }
    }
}
