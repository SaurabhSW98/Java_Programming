package com.corejava.dsa.sorting;

public class QuickSort {

    static int partition(int [] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>=pivot && j>=low+1){
                j--;
            }

            if(i<j){
                //swap arr[i],arr[j]
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        //swap pivot and arr[j]
        int temp = arr[j];
        arr[j] = pivot;
        arr[low] = temp;
        return j;

    }
    static void qS(int [] arr,int low,int high){
            if(low<high){
                int pIndex= partition(arr,low,high);
                qS(arr,low,pIndex-1);
                qS(arr,pIndex+1,high);
            }
    }

    public static void quickSort(int [] arr){
        int n= arr.length;
        qS(arr,0,n-1);
    }

    public static void main(String[] args) {
        int [] arr = {9, 4, 7, 6, 3, 1, 5};
        System.out.println("Before sorting array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        quickSort(arr);
        System.out.println("After sorting array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
