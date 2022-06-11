package dev.practice.corejava.exceptionhandling.finallyblock;

public class OnlyOneCaseFinallyNotExecute {

    public static void main(String[] args) {

        //Only finally not executed in one case
        //When we use System.Exit()
        try{
            System.exit(1);
        }catch(Exception e){
            return;
        }finally {
            System.out.println("Generally use to close objects");
        }
    }
}
