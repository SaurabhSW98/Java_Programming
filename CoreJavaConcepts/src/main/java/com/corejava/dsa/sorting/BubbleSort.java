package com.corejava.dsa.sorting;

public class BubbleSort {
    public static void bubble_sort(int[] arr, int n) {
        for (int i = n-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        System.out.println("After bubble sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

        int arr[] = {8,13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before bubble sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubble_sort(arr, n);
    }
}

