package com.corejava.example.threads;

public class ThreadStateImpl extends Thread {
    @Override
    public void run() {
        System.out.println("RUNNING");

        //TIMED-WAITING
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new ThreadStateImpl();
        //NEW
        System.out.println(t1.getState());
        t1.start();
        //RUNNABLE
        System.out.println(t1.getState());
        Thread.sleep(100);
        //RUNNING (manually added)
        System.out.println(t1.getState());
        t1.join();
        //TERMINATED
        System.out.println(t1.getState());

        //thread methods : run, sleep, join



    }


}
