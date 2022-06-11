package dev.practice.corejava.collections.customrgenericwithrestriction;

import java.util.Comparator;

//extend Thread class and implement Comparator interface
public class CanExtendOwn extends Thread implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        return 0;
    }
}
