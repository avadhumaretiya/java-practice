package dev.practice.maps.weakhashmap;

import java.util.Map;

public class WeakHashMaps {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize called");
    }
}
