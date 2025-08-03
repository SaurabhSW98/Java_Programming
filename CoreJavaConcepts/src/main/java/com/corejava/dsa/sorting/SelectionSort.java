package com.corejava.dsa.sorting;

public class SelectionSort {

    public static void selection_sort(int[] arr, int n) {
        for(int i=0;i<=n-2;i++){
               int mini = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
            //swap 1st element in the iteration with the minimum element
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini]=temp;
        }
        System.out.println("After selection sort:");
           for(int i=0;i<n;i++){
               System.out.print(arr[i]+" ");
           }
    }
    public static void main(String[] args) {

        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selection_sort(arr, n);

    }
}