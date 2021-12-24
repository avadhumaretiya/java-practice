package dev.practice.corejava.exceptionhandling.customexception.checkedexception;

public class Main {

    public static void main(String[] args) throws Exception{

        //Throw exception as per requirement
        //It displays Exception type which you mentioned and message which you pass in argument
        throw new CheckedCustomException("Compile time or Checked Custom Exception");
    }
}
