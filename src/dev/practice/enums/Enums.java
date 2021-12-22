package dev.practice.enums;

//It is an internally a class which extends abstract class Enum
//So we can not extend another class but we can implement other interfaces
public enum Enums {

    //These are consider as an objects(constants) of an Enum class
    //These are by default public static void
    //So they can be called by class name or Enum name

    //Here we assign values to constants
    //because of they are abjects we need to create a constructor
    FIRSTNAME(10),LASTNAME(20),AGE(30);

    //also we can assign values to constants
    int i=0;
    Enums(int i){
        this.i=i;
    }

    public int getI(){
        return this.i;
    }
}
