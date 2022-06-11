package dev.practice.corejava.collections.customrgenericwithrestriction;

import java.util.Comparator;

//Here we only allow two types
//We can add more types by & sign if there is class or interface
public class CustomGenericClassWithRestriction<T extends Thread & Comparator> {


}
