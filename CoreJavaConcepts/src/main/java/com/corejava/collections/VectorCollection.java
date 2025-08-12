package com.corejava.collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorCollection {

    //synchronized in comparison to ArrayList which is not synchronized

    //
    public static void main(String[] args) {
        //ArrayList<Integer> list1 = new ArrayList<>(); // using arraylist the output is never 2000

        Vector<Integer> list1 = new Vector<>();///the output size of list1 is always 2000 in the end due to synchronized nature of vector
//other methods are same as Arraylist

        /// in multithreaded environment use Vector
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list1.add(i);
            }

        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list1.add(i);
            }

        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list1.size());

    }
}

