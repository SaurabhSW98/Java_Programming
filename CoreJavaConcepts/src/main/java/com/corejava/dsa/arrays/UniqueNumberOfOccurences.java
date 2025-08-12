package com.corejava.dsa.arrays;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurences {

    public static boolean uniqueOccurences(int [] arr){

        //put the frequencies of the values in the array
        var hashmap = new HashMap<Integer,Integer>();

        //loop on array
        for(int val : arr){
            if(!hashmap.containsKey(val)){
                hashmap.put(val,1);
            }else{
                hashmap.put(val,hashmap.getOrDefault(val,0)+1);
            }
        }

        //put the unique frequencies from the hashmap, if duplicates return false
        var set = new HashSet<Integer>();
        //loop on hashmap.values
         for (int freq: hashmap.values()){
              if(set.contains(freq)){
                  return false;
              }else
                  set.add(freq);
         }
         return true;
    }

    public static void main(String[] args) {
        int [] arr1 = {1,2,2,3,3,3,4};
        System.out.println(uniqueOccurences(arr1));
    }
}
