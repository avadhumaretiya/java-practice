package dev.practice;

/*Parent abstract, Child no-abstract*/
abstract class Parent4{
    public abstract void abstractCanOverride();
}
class Child4 extends Parent4{
    public void abstractCanOverride(){
        System.out.println("Call Child class method");
    }
}
/**/

/*Parent no-abstract, Child Abstract*/
class Parent5{
    public void abstractCanOverride(){
        System.out.println("Call Parent class method");
    }
}
abstract class Child5 extends Parent5{
    public abstract void abstractCanOverride();
}
/**/

public class OverridngCase5 {
    public static void main(String[] args) {
        //Abstract method can be override parent(abstract)-child(no-abstract)
        //Also in reverse possible parent(no-abstract)-child(abstract)
    }
}
