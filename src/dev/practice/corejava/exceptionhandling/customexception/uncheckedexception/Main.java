package dev.practice.corejava.exceptionhandling.customexception.uncheckedexception;

public class Main {

    public static void main(String[] args) {

        //Throw exception as per requirement
        //It displays Exception type which you mentioned and message which you pass in argument
        throw new UncheckedCustomException("Runtime or Unchecked Custom Exception");
    }
}
