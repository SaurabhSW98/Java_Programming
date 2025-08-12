package com.corejava.example.threads;

public class TheadMethods extends Thread {
    //run,start,join,sleep
    //setPriority



    public TheadMethods(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" priority : "+Thread.currentThread().getPriority()+" count :"+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                throw new RuntimeException();
            }
        }
    }

    public static void main(String[] args) {
        TheadMethods t1 = new TheadMethods("Thread 1");
        TheadMethods t2 = new TheadMethods("Thread 2");
        TheadMethods t3 = new TheadMethods("Thread 3");
        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(MIN_PRIORITY);
        t3.setPriority(NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();

    }
}
