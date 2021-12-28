package dev.practice.java8.defaultandstaticmethodsofinterface.mainmethodininterface;

public interface MainMethodInInterface {

    //Because main method is static
    //We can use main method in interface and directly run interface
    public static void main(String[] args) {
        System.out.println("Interface Main method");
    }
}
