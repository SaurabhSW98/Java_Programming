package com.corejava.example.threads.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private final Lock lock = new ReentrantLock();
    private int balance = 100;

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting withdraw: rs : " + amount);
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    System.out.println(Thread.currentThread().getName() + " proceeding with the transaction ");
                    try {
                        Thread.sleep(10000);
                        balance= balance - amount;
                        System.out.println(" Completed withdrawal,Remaining balance : "+balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                      finally {
                        lock.unlock();
                    }
                }
                else System.out.println(Thread.currentThread().getName()+ ": Insufficient balance");
            }
            else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock");
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
