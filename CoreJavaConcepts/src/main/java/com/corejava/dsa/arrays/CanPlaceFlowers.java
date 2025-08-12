package com.corejava.dsa.arrays;

public class CanPlaceFlowers {

    public static boolean canPlace(int [] flw, int n){
        //1 0 0 0 1    ,   1
        int count =0;
        int len = flw.length;

        for(int i =0;i<len;i++){
            if(flw[i]==0){
                boolean emt_left = (i==0) || (flw[i-1]==0);
                boolean emt_right = (i==len-1) || (flw[i+1]==0);
                if(emt_left && emt_right){
                    flw[i]=1;
                    count++;
                if(count >= n){
                    return true;
                    }
                }
            }
        }
        return count>=n;
    }

    public static void main(String[] args) {
        int [] arr = {0,0,0,1,0};
        int n1 =2;
        System.out.println(canPlace(arr,n1));

    }
}
