package dev.practice.corejava.collections.comparableandcomparator.comparator.stringbuilder;

import java.util.Comparator;

public class SBComparator implements Comparator<StringBuffer> {

    //Here we override compare method
    @Override
    public int compare(StringBuffer stringBuffer, StringBuffer stringBuffer1) {
        String s1=stringBuffer.toString();
        String s2=stringBuffer1.toString();
        return s1.compareTo(s2);
    }
}
