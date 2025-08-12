package com.corejava.dsa.arrays;

public class ArrayRotationByDPlaces {

    static void reverse(int[] arr, int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotateArray(int arr [] , int k ){
        int n = arr.length;

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k,n-1);
        reverse(arr,0,n-1);

    }

    public static void main(String[] args) {
        int[] arr2 = {1,2,3,4,5,6,7};
        int k = 2;
        rotateArray(arr2,k);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
