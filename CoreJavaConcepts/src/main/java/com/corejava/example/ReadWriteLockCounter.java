package com.corejava.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockCounter {

    private int count =0;

    private final ReadWriteLock lock1 = new ReentrantReadWriteLock();

    private final Lock readlock = lock1.readLock();

    private final Lock writelock = lock1.writeLock();

    public void increment(){
        writelock.lock();
        try {
            count++;
        }
        finally {
            writelock.unlock();
        }
    }

    public int getCount(){
        readlock.lock();
        try {
            return count;
        }finally {
            readlock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteLockCounter counter = new ReadWriteLockCounter();

        Runnable writeTask = () -> {
            for(int i=0;i<10;i++){
                counter.increment();
                System.out.println(Thread.currentThread().getName()+" incremented");
            }
        };

        Runnable readTask = () -> {
            for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+" read : "+counter.getCount());
            }
        };

        Thread writer = new Thread(writeTask);
        Thread reader1 = new Thread(readTask);
        Thread reader2 = new Thread(readTask);

        writer.start();
        reader1.start();
        reader2.start();

        writer.join();
        reader1.join();
        reader2.join();

        System.out.println("final count is :"+ counter.getCount());

    }

}
