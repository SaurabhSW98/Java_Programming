package com.corejava.collections;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        /// Last In First Out

        Stack<Integer> stack1 = new Stack<>();
        stack1.push(18);
        stack1.push(89);
        stack1.push(180);
        stack1.push(890);
        //stack1.pop();

        stack1.peek();
        System.out.println(stack1.peek());

        //89 18

        System.out.println(stack1);
        stack1.pop();
        System.out.println(stack1);


    }
}
