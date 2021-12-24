package dev.practice.corejava.arrays.basicarray;

public class BasicArray {

    public void declareDefineArray(){

        //Declare array
        //Same for all the primitive return type
        //Array only stores same data type values
        //Array size should be pre-defined//cannot be change after define
        //We can change the value of any position in array
        //Way 1
        int a1[]={10,20,30,40,50};
        int[] a2={10,20,30,40,50};

        //Way 2
        //Following two arrays gives exception because size of array not mentioned
        //int[] a3=new int[];
        //int a4[]=new int[];
        //If we do not fill any values in array then it considers that return type default value
        //Like here for int default value is 0
        int[] a3=new int[5];
        int a4[]=new int[5];

        //Call enterValuesInArray Method
        enterValuesInArray(a1,a2,a3,a4);

    }

    public void enterValuesInArray(int[] a1,int[] a2,int[] a3,int[] a4){

        //Change value in defined array with size
        //Before change value
        System.out.println(a1[2]+" & "+a2[3]+" & "+a3[4]+" & "+a4[1]);
        a1[2]=10;
        a2[3]=10;
        a3[4]=10;
        a4[1]=10;
        //Also we can use wrapper class here
        //Autoboxing happen here
        a1[3]=new Integer(10);
        a2[4]=new Integer(10);
        a3[0]=new Integer(10);
        a4[1]=new Integer(10);
        //After change value
        System.out.println(a1[2]+" & "+a2[3]+" & "+a3[4]+" & "+a4[1]);

        //Call Operation Method
        operationOnArray(a1,a2,a3,a4);
    }

    public void operationOnArray(int[] a1,int[] a2,int[] a3,int[] a4){

        //If we want to print all the value of an array then we can just write syntax as above for all elements of array
        //Otherwise simply write loop
        for (int i=0;i<a1.length;i++){
            System.out.println(a3[i]);
        }

        //Using For-Each loop
        //only need to assign one variable and array object
        //Only goes in forward manner//Cannot be start from intermediate or last
        //Get one by one elements
        for (int i:a3) {
            System.out.println(a3[i]);
        }

        //If we tried to change value out of the size of an array then it throws an exception ArrayIndexOutOfBound
        a1[5]=10;
    }


}
