package dev.practice.java8.methodandconstructorreferencebyusingdoublecolonoperator.basicconstructorreference;
public class Main {

    public static void main(String[] args) {

        BasicConstructorReferenceInterface basicConstructorReferenceInterface=BasicConstructorReference::new;
        BasicConstructorReference basicConstructorReference=basicConstructorReferenceInterface.get();
    }
}
