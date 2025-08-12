package com.corejava.dsa.string;

import java.util.HashMap;

public class Anagram {

    public static boolean isAnagram(String s, String t) {
        //if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);

        }
        for (int j = 0; j < t.length(); j++) {
            map2.put(t.charAt(j), map2.getOrDefault(t.charAt(j), 0) + 1);

        }
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(isAnagram(s1, s2));
    }
}
