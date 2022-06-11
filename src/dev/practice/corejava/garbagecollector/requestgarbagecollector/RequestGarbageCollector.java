package dev.practice.corejava.garbagecollector.requestgarbagecollector;

public class RequestGarbageCollector {

    int objectNumber=0;

    RequestGarbageCollector(int objectNumber){
        this.objectNumber=objectNumber;
        System.out.println("Constructor "+objectNumber);
    }

    public static void main(String[] args) {

        //here we create 3 objects without reference
        new RequestGarbageCollector(1);
        new RequestGarbageCollector(2);
        new RequestGarbageCollector(3);

        for(int i=0;i<=100;i++) {

            //request garbage collector to collect the unwanted or unused stuff
            //again it depends on JVM call garbage collector or not
            //may be this time garbage collector will call by JVM because we request 100 times for garbage collection
            System.gc();
        }
    }

    //This time finalize may call because here we are creating 500000 objects of class
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize "+objectNumber);
    }
}
