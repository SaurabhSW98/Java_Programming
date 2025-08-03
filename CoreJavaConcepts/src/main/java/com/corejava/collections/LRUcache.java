package com.corejava.collections;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUcache<Key,Value> extends LinkedHashMap<Key, Value> {


    private int capacity;

    public LRUcache(int capacity){
        super(capacity,0.5f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Key, Value> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args){

        LRUcache<String ,Integer> cache = new LRUcache<>(3);
        System.out.println();
        cache.put("bob",80);
        cache.put("alice",90);
        cache.put("james",100);
        cache.get("bob");
        cache.put("lisa",85);


        System.out.println(cache);
    }
}
