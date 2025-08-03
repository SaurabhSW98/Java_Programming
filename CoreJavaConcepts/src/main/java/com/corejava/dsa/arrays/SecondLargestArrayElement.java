package com.corejava.dsa.arrays;

public class SecondLargestArrayElement {

    static int secondLargest(int[] arr){
        int n = arr.length;
        //1,2,4,0,8,5,6,20
        int max = arr[0];
        int secmax = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i] > max){
                secmax = max;
                max = arr[i];
            }
            else if(arr[i]< max && arr[i] >secmax){
                secmax=arr[i];
            }
        }
        return  secmax;
    }

    public static void main(String[] args){
          int[] arr1 = {1,2,4,0,8,15,6,20};
          System.out.println(secondLargest(arr1));
    }
}
