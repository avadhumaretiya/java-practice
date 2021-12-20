package dev.practice.exceptionhandling.customexception.uncheckedexception;

public class UncheckedCustomException extends RuntimeException{

    public UncheckedCustomException(String message){

        //no need to use super keyword
        //use this when we need to show specific message
        super(message);
    }
}
