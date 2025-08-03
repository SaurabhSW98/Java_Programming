package com.corejava.example;

import com.corejava.Counter;

public class MyThread extends Thread{

    private  Counter counter;

    public MyThread(Counter counter){
        this.counter=counter;
    }
    @Override
    public  void run(){
        for(int i=0;i<1000;i++){
             counter.increment();
        }
    }

    public static void main(String[] args) {
        Counter counter1= new Counter();
        MyThread t1 = new MyThread(counter1);
        MyThread t2 = new MyThread(counter1);

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }
        catch (Exception e)
        {

        }
        System.out.println(counter1.getCount());
    }
}
