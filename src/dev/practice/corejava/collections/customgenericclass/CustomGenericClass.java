package dev.practice.corejava.collections.customgenericclass;

public class CustomGenericClass<T> {

    T obj;

    CustomGenericClass(T obj){
        this.obj=obj;
    }

    public void displayObjectDetails(){
        System.out.println("Type of an object: "+obj.getClass().getName());
    }

    public T getObj(){
        return obj;
    }
}
