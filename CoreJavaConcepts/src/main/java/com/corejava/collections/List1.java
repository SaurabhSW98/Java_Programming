package com.corejava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<>();
        //add
//        list1.add(89);
//        list1.add(90);
//        list1.add(80);
//        list1.add(88);
//        list1.sort(null);
//        System.out.println(list1);
//        list1.remove(Integer.valueOf(80));
//        System.out.println(list1.getClass().getName());
        //output=java.util.ArrayList

/*        //get
        System.out.println(list1.get(0));

        //size
        System.out.println(list1.size());

        //iterate usinf for loop
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i));
        }

        //iterate using for each loop
        for(int x:list1){
            System.out.println(x);
        }

        //contains
        System.out.println(list1.contains(80));
        System.out.println(list1.contains(8));*/

        //remove at index
        // list1.remove(2);

        //add at index
        // list1.add(0,20);

        //replace at index
        //list1.set(1,90);


//         for(int x:list1){
//             System.out.println(x);
//         }
//
//         System.out.println(list1);

        //returns a fixed size list
 List<String> list2=Arrays.asList("cat");
//    //list2.add("dog");
//        System.out.println(list2.getClass().getName());
//        //output=java.util.Arrays$ArrayList
//
//        String[] arrs={"whdb","suybs","fiue"};
//        System.out.println(arrs);
//        List<String> lis3 = Arrays.asList(arrs);
//        //creating array list using the above list
//        //arraylist from a collection
//        ArrayList<String>arrayList= new ArrayList<>(lis3);
//
//        //arrays list with initial capacity to stop gettting assigned 1.5 times the initial size which is 10 whenever the elements exceed 10
//        ArrayList<Integer>intr=new ArrayList<>(12);
//


//unmodifiable list
        List<String> list4 = List.of("iudiqwnd", "kjcjaen", "iubiuc");


        /// to array method to convert a List to array, and
        ///we pass the new String[0] to the toArray method , this doesn't mean that the size of the String[] array is 0

        String[] array = list4.toArray(new String[0]);
        System.out.println(Arrays.toString(array));
//
//        ArrayList<String> listString= new ArrayList<>();
//        listString.add("buaibcuas");
//        listString.addAll(list4);
//
//        listString.sort(null);
//
//        System.out.println(listString);
//
//
//
//    }

    }
}
