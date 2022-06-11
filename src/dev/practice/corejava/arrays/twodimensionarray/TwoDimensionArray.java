package dev.practice.corejava.arrays.twodimensionarray;

public class TwoDimensionArray {

    public void declareAndDefineArray(){

        //Declare two dimension array
        //Way 1
        //Here first square bracket size can be consider as a row and second square bracket size can be consider as a column
        int a1[][]=new int[2][3];
        int[] a2[]=new int[3][3];
        int[][] a3=new int[3][4];

        //Way 2
        //Here curly brackets can consider as a row and elements in curly brackets can consider as a column
        int a4[][]={{1,2,3},{4,5,6},{7,8,9}};
        int a5[][]={{1,2},{3,4,5},{6,7,8,9}};

        //Check length
        //Length of First dimensions of an array
        System.out.println(a1.length);
        System.out.println(a2.length);
        System.out.println(a3.length);

        //Length of Second dimensions of an array
        System.out.println(a1[0].length);
        System.out.println(a2[0].length);
        System.out.println(a3[0].length);

        displayArrayElements(a4,a5);
    }

    public void displayArrayElements(int a[][],int b[][]){

        System.out.println();
        //Here we use two separate for loops for two dimensions
        //Both dimensions have same length
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        //Here we use two separate for loops for two dimensions
        //Both dimensions have different length
        for(int i=0;i<b.length;i++){
            if(i==0) {
                for (int j = 0; j < b[0].length; j++) {
                    System.out.print(b[i][j]);
                }
            }else if(i==1){
                for (int j = 0; j < b[1].length; j++) {
                    System.out.print(b[i][j]);
                }
            }else if(i==2){
                for (int j = 0; j < b[2].length; j++) {
                    System.out.print(b[i][j]);
                }
            }
            System.out.println();
        }
    }
}
