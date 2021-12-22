package dev.practice.arrays.arrayprograms;

public class ChnageValueWithCondition {

    public static void main(String[] args) {

        //Declare and define arrays
        int a[]={5,3,5,6,3,5};
        int b[]={2,3,8,5,3,5,5};

        //Change 5 into 0 if 5 come after 3
        for(int i=0;i<a.length-1;i++){
            if(a[i]==3 && a[i+1]==5){
                a[i+1]=0;
            }
        }

        //after change elements
        for (int i:a) {
            System.out.println(i);
        }

        int sum=0;
        //Do sum of all the elements of an array
        for(int i=0;i<b.length;i++){
            sum=sum+b[i];
        }
        System.out.println(sum);
    }
}
