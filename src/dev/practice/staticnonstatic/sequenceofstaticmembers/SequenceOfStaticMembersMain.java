package dev.practice.staticnonstatic.sequenceofstaticmembers;

public class SequenceOfStaticMembersMain {

    public static void main(String[] args){

        String s5="Main method";
        System.out.println(s5);

        SequenceOfStaticMembers sequenceOfStaticMembers= new SequenceOfStaticMembers();
        System.out.println(sequenceOfStaticMembers.s);
        System.out.println(SequenceOfStaticMembers.s1);
    }
}
