package com.corejava.dsa.arrays;

public class LargestElementInAnArray {

    public static int largestElement(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

        }
        return max;
    }
        public static void main (String[]args){
            int[] nums = new int[]{1, 2, 39, 4, 5, 6999, 700, 8, 9, 1};
            System.out.println(largestElement(nums));
        }
    }
