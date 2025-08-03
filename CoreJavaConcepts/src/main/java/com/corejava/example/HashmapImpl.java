package com.corejava.example;// Java program to Demonstrate the HashMap() constructor
// Importing basic required classes

import java.util.Map;
import java.util.TreeMap;
// Main class
// To add elements to HashMap
class HashmapImpl {
    // Main driver method
    public static void main(String args[])
    {
        Map<Integer,String> hm1 = new TreeMap<>();
        hm1.put(12,"jack");
        hm1.put(50,"jessy");
        System.out.println(hm1);
    }
}