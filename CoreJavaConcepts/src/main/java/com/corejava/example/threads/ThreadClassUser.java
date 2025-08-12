package com.corejava.example.threads;

public class ThreadClassUser {
    public static void main(String[] args) {

        //Thread 1
//        ThreadImpl impl = new ThreadImpl();
//        impl.start();

        //Thread 1 by runnable
        RunnableImpl impl1 = new RunnableImpl();
        Thread t1 = new Thread(impl1);
        t1.start();
//        //Thread 2
        for( ; ;){
            //System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());
        }




        //compiler gives error : unreacheable statement
//        for( ; ;){
//            //System.out.println("Hello");
//            System.out.println(Thread.currentThread().getName());
//        }
    }
}
