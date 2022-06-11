package dev.practice.corejava.staticnonstatic.objectreference;

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
        Initialization.init();
    }

    public static void main(String[] args){
        System.out.println(ObjectReference.objectReference);
    }

}
