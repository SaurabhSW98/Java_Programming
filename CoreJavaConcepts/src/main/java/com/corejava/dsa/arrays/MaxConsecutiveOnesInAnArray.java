package com.corejava.dsa.arrays;

public class MaxConsecutiveOnesInAnArray {

    //1,1,1,2,1,1
    public static int maxCountoNes(int [] arr) {
        int n= arr.length;
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] == 1){
                count++;

            }
            else{
                count = 0;///makes sure the count is reset to 0 , incase the element is not 1;
            }

            max = Math.max(count,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,1,1,1,2,1,1,1};
        System.out.println(maxCountoNes(arr));
    }
}
