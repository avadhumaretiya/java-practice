package dev.practice.corejava.collections.customgenericclass;

public class Main {

    public static void main(String[] args) {

        //Apply String return type
        CustomGenericClass<String> customGenericClass=new CustomGenericClass("String");
        customGenericClass.displayObjectDetails();
        System.out.println(customGenericClass.getObj());

        //Apply Integer return type
        CustomGenericClass<Integer> customGenericClass1=new CustomGenericClass(123);
        customGenericClass1.displayObjectDetails();
        System.out.println(customGenericClass1.getObj());

        //Apply Double return type
        CustomGenericClass<Double> customGenericClass2=new CustomGenericClass(12.23);
        customGenericClass2.displayObjectDetails();
        System.out.println(customGenericClass2.getObj());
    }
}
