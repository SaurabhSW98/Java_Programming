package com.corejava.dsa.string;

public class LargestOddSubString {

    public static String largestOddNumAsString(String nums) {


        for (int i = nums.length() - 1; i >= 0; i--) {
             if(nums.charAt(i) % 2 != 0){
                 return nums.substring(0,i+1);
             }
        }
        return  null;
    }
    public static void main(String[] args) {
           String s = new String("12345687889");
        System.out.println(largestOddNumAsString(s));
    }

}
