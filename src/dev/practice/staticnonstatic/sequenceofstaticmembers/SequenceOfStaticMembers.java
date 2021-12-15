package dev.practice.staticnonstatic.sequenceofstaticmembers;

import dev.practice.staticnonstatic.staticnonstaticblocks.StaticNonStaticBlocks;

public class SequenceOfStaticMembers {

    String s="Non-Static Variable";
    static String s1="Static Variable";

    SequenceOfStaticMembers(){
        String s2="Constructor";
        System.out.println(s2);
    }

    //Initialization block
    {
        String s3="Initialization Block";
        System.out.println(s3);
    }

    //static block
    static{
        String s4="Static Block";
        System.out.println(s4);
    }
}
