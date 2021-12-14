package dev.practice;

/*Parent method(final), Child method(no-final)*/
class Parent3{
    public final void finalCannotOverride(){
        System.out.println("Call Parent class method");
    }
}
class Child3 extends Parent3{
    /*public void finalCannotOverride(){
        System.out.println("Call Child class method");
    }*/
}
/**/

/*Parent method(no-final), Child method(final)*/
class Parent6{
    public void finalCanOverride(){
        System.out.println("Call Parent class method");
    }
}
class Child6 extends Parent6{
    public final void finalCanOverride(){
        System.out.println("Call Child class method");
    }
}
/**/

public class OverridingCase4 {
    public static void main(String[] args) {
        //Final methods cannot redefine so, Child class cannot define final methods of parent class//Parent method(final), Child method(none final)
        //but in reverse case it is possible to override//Parent method(none final), Child method(final)
    }
}
