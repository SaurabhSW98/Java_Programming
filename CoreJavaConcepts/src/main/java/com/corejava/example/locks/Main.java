package com.corejava.example.locks;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();



        //anonymous inner class
        Runnable task = new Runnable() {
            @Override
            public void run() {
              acc.withdraw(50);
            }
        };

        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");
        t1.start();
        t2.start();

    }

}
