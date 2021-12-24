package dev.practice.corejava.garbagecollector.basicgarbagecollection;

public class GarbageCollector {

    int i=0;
    int j=0;
    public static void main(String[] args) {
        GarbageCollector garbageCollector=new GarbageCollector();
        int k=garbageCollector.i+ garbageCollector.j;

        //don't give a reference of two objects //so garbage collector walk in before JVM invoke garbage collector
        //It only runs when system is out of memory Otherwise JVM initiate Garbage collector after execution
        new GarbageCollector();
        new GarbageCollector();

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize Method");
    }
}
