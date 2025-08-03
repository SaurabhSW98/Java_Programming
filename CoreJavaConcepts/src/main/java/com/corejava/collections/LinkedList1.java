package com.corejava.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

/*
    class Node
    {
        public int value;
        public Node next;
    }
*/

    public static void main(String[] args) {

/*
        Node linkedlist= new Node();
        Node linkedlist2= new Node();

        linkedlist2.value=20;
        linkedlist2.next=null;

        linkedlist.value=10;
        linkedlist.next=linkedlist2;

*/

        LinkedList<Integer> linkedList = new LinkedList<>();//doubly linked implementation of List
        linkedList.add(1);
        linkedList.add(14);
        linkedList.add(18);

        linkedList.get(1);
        linkedList.addLast(90);
        linkedList.addFirst(100);
        linkedList.getFirst();
        linkedList.getLast();

        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.removeIf(x->x%2==0);

        LinkedList<String> annimals= new LinkedList<>(Arrays.asList("dog","cat","lamb"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("dog"));

        annimals.removeAll(animalsToRemove);


        List<Integer> list1= new LinkedList<>();


        System.out.println(linkedList);
        System.out.println(annimals);
    }
}

