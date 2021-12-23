package dev.practice.collections.comparableandcomparator.comparator.stringsortbylength;

import java.util.Comparator;

public class StringSortByLength implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        int i=s.length();
        int i1=t1.length();
        if(i<i1){
            //if we want reverse order just change -1 to 1 and 1 to -1
            return -1;
        }else if(i>i1){
            //if we want reverse order just change -1 to 1 and 1 to -1
            return 1;
        }else{
            return s.compareTo(t1);
        }
    }
}
