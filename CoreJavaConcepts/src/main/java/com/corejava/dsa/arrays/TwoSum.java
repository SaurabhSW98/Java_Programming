package com.corejava.dsa.arrays;

import java.util.Arrays;

public class TwoSum {
        static boolean twoSum(int[] arr, int target) {
            int n = arr.length;
            int i= 0;
            int j= n-1;
            Arrays.sort(arr);
            while(i<j){
                int sum = arr[i] + arr[j] ;
                if (sum == target) return true;
                else if (sum < target) i++;
                else j--;
            }
            return false;
        }
        public static void main(String[] args){
            int[] nums = {1,2,3,5,4};
            int target = 7;
            System.out.println(twoSum(nums,target));
        }
}

