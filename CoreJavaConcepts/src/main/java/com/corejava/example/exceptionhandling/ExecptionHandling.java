package com.corejava.example.exceptionhandling;

class SaurabhException extends Exception{
    public SaurabhException(String message){
         super(message);
    }
}
public class ExecptionHandling {
    public static void main(String[] args){
         int i=10;
         int j=0;
         String str = null;
         int [] nums = new int[6];
         try{
             j=18/i;
//             if (i==0){
//                 throw new ArithmeticException("o values not allowed");
//             }
             if (i>5) {
                 throw new SaurabhException("Saurabh stay in limit");
             }
             System.out.println(nums[i]);
             System.out.println(str.length());
         }
         catch(SaurabhException ar){
             System.out.println(ar);
         }
         catch (NullPointerException e){
             System.out.println("Something went wrong" + e);
         }
         catch(ArrayIndexOutOfBoundsException ex){
             System.out.println(ex);
         }
    }

}
