package dev.practice.corejava.maps.weakhashmap;

public class WeakHashMaps {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize called");
    }
}
