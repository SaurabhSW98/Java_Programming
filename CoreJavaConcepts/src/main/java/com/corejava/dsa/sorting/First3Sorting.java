package com.corejava.dsa.sorting;

public class First3Sorting {

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


    public static void insertion_sort(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                //swap
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;

                //go to left
                j--;
            }
        }
        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
