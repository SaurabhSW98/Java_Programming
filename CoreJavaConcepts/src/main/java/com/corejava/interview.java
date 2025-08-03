package com.corejava;
//move all the zeroes to the end
public class interview {
    public static void main(String[] args) {
        int [] arr = new int[]{1,0,0,2,5,0,8};
        int n= arr.length;
       moveZeroes(arr);
       for(int i=0;i<n;i++){
           System.out.println(arr[i]);
       }
    }

    //1,0,0,2,5,0,8
    //i=0;j=1
    public static int[] moveZeroes(int [] arr) {
        int n = arr.length;
        int j=0;
        for (int i = 0; i < n;i++){
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        while(j<n){
            arr[j++]=0;
        }
        return arr;
    }
}
