package com.corejava.dsa.arrays;
//1,3,6,8,9,7  n=6 d=3 => 8,9,7,1,3,6  => brute force store the elements till d-1 in temporary array,
// shift the elements from dth index till the end to 0th index till n-d
//add the temporary array elements to the end of the array
public class RotateArrayByDPlaces {
    public static void rotateArray(int[] nums, int n, int d) {
        d = d % n;
        int temp[] = new int[d];//temp 1,3,6  : 0,1,2 : 3,4,5
        for (int i = 0; i < d; i++) {
            temp[i] = nums[i];
        }
        for (int i = d; i <= n - 1; i++) {
            nums[i - d] = nums[i];
        }

        for (int i = n - d; i <= n - 1; i++) {
            nums[i] = temp[i - (n - d)];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = nums.length;
        rotateArray(nums, n, 7);
        System.out.println("After Rotating the elements to right ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
