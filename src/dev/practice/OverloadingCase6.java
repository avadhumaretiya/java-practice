package dev.practice;

class Animal{

}

class Monkey extends Animal{

}

public class OverloadingCase6 {

    public void objectObject(Animal animal){
        System.out.println("Call Animal argument");
    }

    public void objectObject(Monkey monkey){
        System.out.println("Call Monkey argument");
    }

    public static void main(String[] args) {

        OverloadingCase6 overloading = new OverloadingCase6();
        Animal animal=new Animal();
        Monkey monkey=new Monkey();

        overloading.objectObject(animal);//exact match method calling
        overloading.objectObject(monkey);//exact match method calling

        //Giving a reference of child class object to parent class object
        Animal animal1=new Monkey();
        overloading.objectObject(animal1);

    }
}

