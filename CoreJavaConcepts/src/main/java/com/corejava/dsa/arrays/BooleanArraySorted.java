package com.corejava.dsa.arrays;

import java.util.ArrayList;

public class BooleanArraySorted {
    //static boolean arraySortedBool(int[] arr) {
    static boolean arraySortedBool(ArrayList<Integer> lis1) {
        Integer n = lis1.size();
        for (int i = 1; i < n; i++) {
            if (lis1.get(i) < lis1.get(i-1))
        return false;
        }
        return true;
    }


    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(arraySortedBool(numbers));
    }
}
