package com.corejava.dsa.arrays;

public class NumberAppearOnce {
    public static int findAppearingOnce(int[] arr) {
        int n = arr.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }
    public static void main(String[] args){
        //one number appears once and other appears twice
        int [] arr={990,8,8,2,2,9,9,80,80,100,100,99,99};
        System.out.println(findAppearingOnce(arr));
    }
}