package com.corejava.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLinkedList {

    public static void main(String[] args){
        List<Integer> list12= new ArrayList<Integer>();
        list12.add(12);
        list12.add(90);
        list12.add(0);

        Iterator<Integer> iterator = list12.iterator();

        while(iterator.hasNext()){
            Integer it= iterator.next();
            System.out.println(it);
        }


    }


}
