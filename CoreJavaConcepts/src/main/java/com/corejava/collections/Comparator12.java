package com.corejava.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class INTComparator implements Comparator<Integer>{


    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}

class StringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}
public class Comparator12 {
public static void main(String[] args)
{

    List<String> str1 = Arrays.asList("at", "dogs", "bat", "actor");
    List<Integer>int1=Arrays.asList(1,2,0,4,3,5,1);
    /*
    int1.sort(new INTComparator());*/
    //lambda exp
    int1.sort((a,b) -> b-a);
    str1.sort((a,b) -> b.length()-a.length());
   str1.sort(String::compareTo);//method reference
    System.out.println(int1);
    System.out.println(str1);
   }
}
