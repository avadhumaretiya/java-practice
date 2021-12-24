package dev.practice.corejava.exceptionhandling.customexception.checkedexception;

public class CheckedCustomException extends Exception{

    public CheckedCustomException(String message){

        //no need to use super keyword
        //use this when we need to show specific message
        super(message);
    }
}
