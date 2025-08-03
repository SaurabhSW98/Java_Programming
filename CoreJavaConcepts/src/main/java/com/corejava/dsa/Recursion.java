package com.corejava.dsa;

import java.util.Arrays;
class Recursion {
    static int f(int n){
//        if(n<=1) return n;
//
//        if(dp[n]!= -1) return dp[n];
//        return dp[n]= f(n-1,dp) + f(n-2,dp);
        if (n <= 1) return n;
        return f(n-1) + f(n-2);
    }


    public static void main(String[] args) {

        int n=6;
        int[] dp =new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(f(n));

    }
}