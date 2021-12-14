package dev.practice;

/*Parent - public, child - no any modifier possible*/
class Parent7{
    public void publicParent(){
        System.out.println("Call Parent class method");
    }
}
class Child7 extends Parent7{
    //protected, default, private cannot be used as a child
    public void publicParent(){
        System.out.println("Call Child class method");
    }
}
/**/

/*Parent - protected, child - can be use public*/
class Parent8{
    protected void protectedParent(){
        System.out.println("Call Parent class method");
    }
}
class Child8 extends Parent8{
    //default, private cannot be used as a child
    protected void protectedParent(){
        System.out.println("Call Child class method");
    }
}
class child8_1 extends Parent8{
    public void protectedParent(){
        System.out.println("Call Child class method");
    }
}
/**/

/*Parent - default, child - can be use protected, public*/
class Parent9{
    void defaultParent(){
        System.out.println("Call Parent class method");
    }
}
class Child9 extends Parent9{
    //private cannot be used as a child
    void defaultParent(){
        System.out.println("Call Child class method");
    }
}
class Child9_1 extends Parent9{
    protected void defaultParent(){
        System.out.println("Call Child class method");
    }
}
class Child9_2 extends Parent9{
    public void defaultParent(){
        System.out.println("Call Child class method");
    }
}
/**/

public class OverridingCase6 {
    public static void main(String[] args) {
        //When parent method is public and child method is default, private or protected cannot be override
        //When parent method is protected and child method is private or default cannot be override
        //When parent method is default and child method is private cannot be override
        //Because in overriding we can increase the scope but cannot decrease the scope
        //Scope sequence like this
        //Public>Protected>default>private
    }
}
