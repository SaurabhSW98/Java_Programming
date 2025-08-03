package com.corejava.example;

import java.util.ArrayList;

//find all the non zeroes in the array and append to a ArrayList
//then find length of the ArrayList
//
public class FindAllZeroes {
    public static int[] findAllZeroes(int[] nums,int n) {
        ArrayList <Integer> list1= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                list1.add(nums[i]);
            }
        }
            int z= list1.size();

            for(int i=0;i<z;i++){
                nums[i]=list1.get(i);
            }
            for(int i = z;i<n;i++){
                nums[i]=0;
            }

        return nums;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,0,9,4,0,6,7,8,0};
        int n = nums.length;
        int[]ans=findAllZeroes(nums,n);
        for(int j=0;j<n;j++){
            System.out.print(nums[j]+" ");
        }
    }
}
