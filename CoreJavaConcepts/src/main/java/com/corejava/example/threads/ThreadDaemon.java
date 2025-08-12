package com.corejava.example.threads;

public class ThreadDaemon extends Thread{
    @Override
    public void run(){
       while(true){
           System.out.println("hello dear");
       }
    }

    public static void main(String[] args) {
        ThreadDaemon t1 = new ThreadDaemon();
        t1.setDaemon(true); /// stops the execution of the thread once the main thread is completed

        t1.start();

        System.out.println("Main done");
    }
}
