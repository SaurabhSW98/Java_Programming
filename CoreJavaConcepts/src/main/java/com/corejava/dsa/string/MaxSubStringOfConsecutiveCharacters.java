package com.corejava.dsa.string;

public class MaxSubStringOfConsecutiveCharacters {

    public static int subString(String s) {
        if (s == null || s.length() == 0) return 0;
        int ans = 1;
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                ans = count;
                count = 1;
            }
        }
        return Math.max(count,ans);
    }

    public static void main(String[] args) {
        String s = "llggtteegg";
        System.out.println(subString(s));
    }
}
