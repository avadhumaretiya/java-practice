package dev.practice.java8.predefinedfunctionalinterfaces.primitive.primitivefunction;

import java.util.function.*;

public class PrimitiveFunction {

    public static void main(String[] args) {

        //Create IntFunction to get integer value and return any type value
        //Here Input type value is "int" and return type value is Integer
        IntFunction<Integer> intFunction=i->i*i;
        System.out.println(intFunction.apply(10));

        //Create ToIntFunction
        //Here Input type value any return type and return type value is "int"
        ToIntFunction<String> toIntFunction =s->s.length();
        //applyAsInt() method to return int value
        System.out.println(toIntFunction.applyAsInt("avadh"));

        //Create IntToDoubleFunction
        //Here Input type value is int and return type value is double
        IntToDoubleFunction intToDoubleFunction=i->Math.sqrt(i);
        //applyAdDouble() method to return double value
        System.out.println(intToDoubleFunction.applyAsDouble(5));


        //There are 15 primitive type functions

        //Input type is always primitive type and return type is any type
        //IntFunction
        //LongFunction
        //DoubleFunction

        //Return type is always primitive type and Input type is any type
        //ToIntFunction->method = applyToInt()
        //ToDoubleFunction->method = applyToDouble()
        //ToLongFunction->method = applyToLong()

        //Input type and Return type both are primitive type
        //IntToLongFunction->method = applyToLong()
        //IntToDoubleFunction->method = applyToDouble()
        //LongToIntFunction->method = applyToInt()
        //LongToDoubleFunction->method = applyToDouble()
        //DoubleToIntFunction->method = applyToInt()
        //DoubleToLongFunction->method = applyToLong()

        //BiFunctions
        //Return type is always primitive and Input types are any type
        //ToIntBiFunction->method = applyToInt()
        //ToLongBiFunction->method = applyToLong()
        //ToDoubleBiFunction->method = applyToDouble()



    }
}
