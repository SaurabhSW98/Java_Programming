package com.corejava.dsa.arrays;

public class LargestElementInAnArray {

    public static int largestElement(int[] nums) {
        int max = nums[0];
        for (int i = 1; i <= (nums.length) - 1; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }


        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 39090, 4, 5, 6999, 700, 8, 9, 10};
        System.out.println(largestElement(nums));
    }
}
