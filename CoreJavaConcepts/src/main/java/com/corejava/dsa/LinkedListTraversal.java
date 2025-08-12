package com.corejava.dsa;

public class LinkedListTraversal {
    public static Node convertArrayToLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
                for(int i=1;i<arr.length;i++){
                   Node temp = new Node(arr[i]);
                   mover.next = temp;
                   mover = temp;
                }
                return head;
    }
    public static void main(String[] args) {
        int [ ] arr = {1,2,3,4,5,6,7,8,9};
        Node head = convertArrayToLinkedList(arr);
        System.out.println(head);

        Node temp= head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
