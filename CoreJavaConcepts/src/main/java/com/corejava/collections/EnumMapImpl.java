package com.corejava.collections;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

enum Days{SUNDAY,MONDAY,TUESDAY,WEDNESDAY}
public class EnumMapImpl {
    public static void main(String[] args) {
        Map <Days,String> map1 = new EnumMap<>(Days.class);
        map1.put(Days.SUNDAY,"Trek");

        /// no hashing
        /// ordinal/index in ENUM  is used
        /// faster than hashmap
        /// memory efficient

        System.out.println(map1);
    }






}
