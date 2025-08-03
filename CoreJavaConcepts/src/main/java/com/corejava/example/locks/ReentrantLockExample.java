package com.corejava.example.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private final Lock lock = new ReentrantLock();
    /// prevention of deadlock due to us eof reentrant lock

    public void outerMethod(){
        lock.lock();
        try {
            System.out.println("Outer lock");
            innerMethod();
            System.out.println("still lock acquired");
        }
        finally {
            lock.unlock();
            System.out.println("lock released now");
        }
    }

    public void innerMethod(){
        lock.lock();
        try {
            System.out.println("Inner lock");
        }
        finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample l1 = new ReentrantLockExample();
        l1.outerMethod();
    }

}
