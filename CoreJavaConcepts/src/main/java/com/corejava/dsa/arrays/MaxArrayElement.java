package com.corejava.dsa.arrays;

public class MaxArrayElement {

    public static int maxElement(int[] nums){
        int n = nums.length;
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
          int[] arr1={1,2,598,599,60,0};
          System.out.println(maxElement(arr1));

    }
}