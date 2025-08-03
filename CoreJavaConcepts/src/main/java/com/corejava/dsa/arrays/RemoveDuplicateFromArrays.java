package com.corejava.dsa.arrays;

public class RemoveDuplicateFromArrays {
     public static int removedDuplicates(int [] arr){
         //1,2,3,4,4,5,5,6
//         HashSet<Integer> unique= new HashSet<Integer>();
//
//         for(int i=0;i<arr.length;i++){
//             unique.add(arr[i]);
//         }
//
//         int k = unique.size();
//         int j=0;
//         for(int x:unique){
//             arr[j] = x;
//             j++;
//         }
//         for(int n : arr){}
//         return k;

         int i =0;
         for(int j=1;j<arr.length;j++){
             if (arr[i] != arr[j]){
                 i++;
                 arr[i] = arr[j];
             }
         }
         return i+1;
     }
     public static void main(String[] args){
         int[] arr2= {1,1,1,2,2,2,3,3,3,4,4,5,5,6,6,6,6,6,6,6};
         System.out.println(removedDuplicates(arr2));
     }
}
