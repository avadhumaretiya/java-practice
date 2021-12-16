package dev.practice.exceptionhandling.arrayexceptions;

public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {

        int a[]={1,2,3};

        //create an array of 3 length
        //run for loop 4 times//at last it going to find position 3 in array but last position of element of an array is 3
        //getting exception ArrayIndexOutOfBound
        for (int i=0;i<=3;i++){
            int j=a[i];
        }

        //This code written after the code which cause the exception
        //So it is not going to be execute because exception handling not applied
        System.out.println(a[0]);

    }
}
