package com.corejava.dsa.arrays;

public class BooleanArraySorted {

    static boolean isArraySorted(int [] arr)
    {
        for(int i = 0;i < arr.length;i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args){
        int [] arr1= {8,1,2,3,4,5,70};
        System.out.println(isArraySorted(arr1));
    }
}
