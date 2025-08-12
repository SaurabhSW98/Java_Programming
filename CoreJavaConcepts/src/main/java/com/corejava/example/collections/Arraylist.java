package com.corejava.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        Collection collect = new ArrayList();
        List list = new ArrayList<>();
        list.indexOf(0);
        System.out.println(list.indexOf(0));
        ArrayList<Integer> l1 = new ArrayList();
        l1.add(123);
        l1.add(1234);

        ArrayList<Integer> l2 = new ArrayList();
        l2.addAll(l1);

        System.out.println(l2);

    }
}
