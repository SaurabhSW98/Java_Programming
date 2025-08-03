package com.corejava.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmapImpl {
//not thread safe same as HashMap
    public static void main(String[] args){
        LinkedHashMap<Integer,String> hashmap= new LinkedHashMap<>(10,0.5f,true);

        // order is maintained , internally uses a linked list to store the order of the elements added
        //hence generally slower than Hashmap
        hashmap.put(350,"HONDA");
        hashmap.put(200,"BAJAJ");
        hashmap.put(650,"RE");
        hashmap.get(350);
        hashmap.get(650);

        System.out.println(hashmap);

        for(Map.Entry<Integer,String> entry : hashmap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        HashMap<String,String> hashMap1 = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap<>(hashMap1);

        linkedHashMap1.put("john","male");
        linkedHashMap1.put("stacy","female");
        linkedHashMap1.put("lisa","lesbian");

        System.out.println(linkedHashMap1.getOrDefault("lis","emale"));
        linkedHashMap1.putIfAbsent("joey","shemale");
        System.out.println(linkedHashMap1);

    }
}
