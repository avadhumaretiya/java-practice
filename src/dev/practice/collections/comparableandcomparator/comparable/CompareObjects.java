package dev.practice.collections.comparableandcomparator.comparable;

public class CompareObjects implements Comparable<CompareObjects>{

    int id;
    String name;
    CompareObjects(int id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public int compareTo(CompareObjects compareObjects) {
        int i=this.id;
        int i1=compareObjects.id;
        if(i<i1){
            return  -1;
        }else if(i>i1){
            return 1;
        }else{
            return 0;
        }
    }
}
