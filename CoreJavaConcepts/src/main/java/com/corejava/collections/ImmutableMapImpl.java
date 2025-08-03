package com.corejava.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapImpl {

    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("java",11);
        map1.put("scala",12);

        Map<String,Integer>map2 = Collections.unmodifiableMap(map1);
       // map2.put("python",10);//throws exception;unmodifiable map2

        Map<String,Integer> map3 = Map.of("java",12,"python",14,"c++",18);
        map3.put("c#",90);
        Map<String,Integer>map4 = Map.ofEntries(Map.entry("java",12),Map.entry("machine",10));
        map4.put("golang",18);
    }
}
