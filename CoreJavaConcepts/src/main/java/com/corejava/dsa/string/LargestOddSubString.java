package com.corejava.dsa.string;

public class LargestOddSubString {

    public static String largestOddNumAsString(String nums) {


        for (int i = nums.length() - 1; i >= 0; i--) {

            if ((nums.charAt(i) - '0') % 2 != 0) {
                return nums.substring(0, i + 1);
            }


        }
        return "";
    }

    public static void main(String[] args) {
           String s = new String("1234568788");
        System.out.println(largestOddNumAsString(s));
    }

}
