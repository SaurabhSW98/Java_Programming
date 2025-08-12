package com.corejava.example.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetHashTree {
    public static void  main(String[] args){
        Set<Integer> set1=new HashSet<>();
        set1.add(90);
        set1.add(234);
        set1.add(1);
        set1.add(781);
        set1.add(8);
        set1.add(67818);

        Set<Integer> set2=new TreeSet<>();
        set2.add(90);
        set2.add(234);
        set2.add(1);
        set2.add(781);
        set2.add(8);
        set2.add(67818);

        Set<Integer> set3 = new LinkedHashSet<>();


        for(int n : set2){
            System.out.println(n);
        }

    }
}
