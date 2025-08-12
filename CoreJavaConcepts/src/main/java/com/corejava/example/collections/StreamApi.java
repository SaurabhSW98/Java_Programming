package com.corejava.example.collections;

import java.util.Arrays;
import java.util.List;

public class StreamApi {
       public  static  void  main(String[] args) {
           List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7,90,88,99);
           //list1.forEach(n->System.out.println(n*3));

           List<Integer>list3=list1.stream().filter(n->n%2==0).toList();


           List<Integer>list4=list1.stream().map(n->n*8).toList();



           System.out.println(list1.stream().reduce(0,(c,e)->c+e));


       }
}
