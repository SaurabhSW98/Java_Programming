package com.corejava.dsa.sorting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class MergeSort {

    public static void merge(int[] arr, int low, int mid, int high) {
        Vector<Integer> list1 = new Vector<>();

        int left = low;
        int right = mid + 1;


        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list1.add(arr[left]);
                left++;
            } else {
                list1.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            list1.add(arr[left]);
            left++;
        }

        while (right <= high) {
            list1.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = list1.get(i - low);
        }
    }

    public static void sort(int[] arr, int low, int high) {
        if (low == high) return;
        int mid = (low + high) / 2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void mergesort(int[] arr, int n) {
        sort(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int n = 7;
        int [] arr = {9, 4, 7, 6, 3, 1, 5};
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergesort(arr, n);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
