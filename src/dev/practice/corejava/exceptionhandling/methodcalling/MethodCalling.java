package dev.practice.corejava.exceptionhandling.methodcalling;

public class MethodCalling {

    public int addition(int i,int j){
        int k= i+j;
        return k;
    }

    public int multiplication(int i,int j){
        int k=i*j;
        return k;
    }

    public static int division(int i, int j){
        int k=0;
        try {
            k = i / j;
        }catch(Exception exception){
            System.out.println("Please do not enter zero");
        }
        return k;
    }

    public static int subtraction(int i,int j){
        int k=i-j;
        return k;
    }

    public void calculator(){

        //call none static and static methods without class object in none static method
        addition(4,2);
        multiplication(4,2);
        division(4,2);
        subtraction(4,2);

        //call none static and static methods with class object in none static method
        MethodCalling methodCalling= new MethodCalling();
        methodCalling.addition(4,2);
        methodCalling.multiplication(4,2);
        methodCalling.division(4,2);
        methodCalling.subtraction(4,2);

        //call static methods with class name in none static method
        MethodCalling.subtraction(4,2);
        MethodCalling.division(4,2);

    }

    public static void calculations(){

        //call none static and static methods without class object in static method
        //cannot call none static methods without class object in static method
        //addition(4,2);
        //multiplication(4,2);
        division(4,2);
        subtraction(4,2);

        //call none static and static methods with class object in static method
        MethodCalling methodCalling= new MethodCalling();
        methodCalling.addition(4,2);
        methodCalling.multiplication(4,2);
        methodCalling.division(4,2);
        methodCalling.subtraction(4,2);

        //call static methods with class name in static method
        MethodCalling.subtraction(4,2);
        MethodCalling.division(4,2);

    }

    public void callMethodsInArgumentOfMethod(int i,int j,int k,int l){
        int additionResult=i;
        int subtractionResult=j;
        int multiplicationResult=k;
        int divisionResult=l;
    }


    public static void main(String[] args) {

        //Same conditions applied for main method like static method because main method is also a static method
        //call none static and static methods without class object in static method
        //cannot call none static methods without class object in static method
        //addition(4,2);
        //multiplication(4,2);
        division(4,2);
        subtraction(4,2);

        //call none static and static methods with class object in static method
        MethodCalling methodCalling= new MethodCalling();
        methodCalling.addition(4,2);
        methodCalling.multiplication(4,2);
        methodCalling.division(4,2);
        methodCalling.subtraction(4,2);

        //call static methods with class name in static method
        MethodCalling.subtraction(4,2);
        MethodCalling.division(4,2);

        //Call methods in argument of method
        //Call static and none static methods in argument of method
        methodCalling.callMethodsInArgumentOfMethod(methodCalling.addition(4,2), subtraction(4,2), methodCalling.multiplication(4,2),division(4,2) );

        //Call Method int argument of method in argument of method ......
        methodCalling.callMethodsInArgumentOfMethod(methodCalling.addition(methodCalling.addition(4,2), methodCalling.addition(4,2)),
                subtraction(subtraction(4,2),subtraction(4,2)),
                methodCalling.multiplication(methodCalling.multiplication(4,2), methodCalling.multiplication(4,2)),
                division(division(4,2),division(4,2)));
    }
}
