package com.corejava.dsa.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IsomorphicString {

    public static boolean isIsomorphicString(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            char y = t.charAt(i);

            // to check if the map contains the key and if present is the value equal to the y
            if (map.containsKey(x)) {
                if (map.get(x) != y) return false;
            }
            //given key : x is not present to check if the set contains the value already
            else if (set.contains(y)) return false;
            map.put(x, y);
            set.add(y);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "add";
        String t = "ego";
        System.out.println(isIsomorphicString(s, t));

    }
}
