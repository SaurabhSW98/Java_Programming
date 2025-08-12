package com.corejava.dsa.arrays;

public class ArrayRotationByOnePlace {

    public static void rotateArray(int [] arr){
        int n = arr.length;
        int temp = arr[0];

        for(int i=0;i<=n-2;i++){
            arr[i] = arr[i+1];
        }

        arr[n-1]=temp;

        for(int i =0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {4,1,2,3,4,5};

        rotateArray(arr);
    }
}
