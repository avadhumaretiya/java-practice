package dev.practice;

public class ObjectReference {

    //create static reference
    static  ObjectReference objectReference;

    //object reference in static block
    static {
        System.out.println(objectReference);
        objectReference=new ObjectReference();
        System.out.println(objectReference);

        //Create none static object reference in static block
        ObjectReference objectReference1=new ObjectReference();
        System.out.println(objectReference1);

        //call static method
        ObjectReference.init();
    }

    public static void main(String[] args){
        System.out.println(ObjectReference.objectReference);
    }

    static void init(){
        //create object reference in static method
        ObjectReference objectReference=new ObjectReference();
    }

}
