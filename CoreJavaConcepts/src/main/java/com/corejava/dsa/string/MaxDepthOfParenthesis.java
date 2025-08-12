package com.corejava.dsa.string;

public class MaxDepthOfParenthesis {

    static int depth(String s){
        int res=0;
        int curr=0;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c =='('){
                curr++;
                res = Math.max(res,curr);
            }
            else if( c == ')'){
                curr--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s= "abc";
        String t = "((())";
        System.out.println(depth(t));
    }
}
