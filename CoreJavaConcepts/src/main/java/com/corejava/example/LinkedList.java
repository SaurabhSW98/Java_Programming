package com.corejava.example;

class Node{
    int data;
    Node next;
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        Node y = new Node(a[4]);
        System.out.println(y.next);
    }
}
