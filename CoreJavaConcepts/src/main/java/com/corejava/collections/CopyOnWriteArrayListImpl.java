package com.corejava.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListImpl {

    public  static  void  main(String[] args){
        CopyOnWriteArrayList<String> list1= new CopyOnWriteArrayList<>();
        list1.add("cake");
        list1.add("milk");
        list1.add("eggs");
        System.out.println("initial list "+list1);

        for(String item:list1){
            //loop is applied on the initial list and then once the loop is completed, new list is created which is a copy
            System.out.println(item);
            if(item.equals("milk")){
                list1.add("butter");
                System.out.println("added butter to the list");
            }
        }
        System.out.println("updated list is "+list1);
/// multi thread example
        List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item3");
        Thread readerThread = new Thread(() -> {
            try {
                while (true) {
                    // Iterate through the list
                    for (String item : sharedList) {
                        System.out.println("Reading item: " + item);
                        Thread.sleep(100); // Small delay to simulate work
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception in reader thread: " + e);
            }
        });
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(500); // Delay to allow reading to start first
                sharedList.add("Item4");
                System.out.println("Added Item4 to the list.");

                Thread.sleep(500);
                sharedList.remove("Item1");
                System.out.println("Removed Item1 from the list.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        readerThread.start();
        writerThread.start();
    }
}
