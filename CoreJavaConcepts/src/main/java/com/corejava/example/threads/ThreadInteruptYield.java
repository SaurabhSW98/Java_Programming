package com.corejava.example.threads;

public class ThreadInteruptYield extends Thread {

    public ThreadInteruptYield(String name){
        super(name);
    }

    @Override
    public void  run() {
        try {
            Thread.sleep(10000);
            System.out.println("Thread is running");
        } catch (InterruptedException i) {
            System.out.println("thread interrupted : " + i);
        }

    }

    /// yield method impl
//        for(int i=0;i<5;i++){
//            System.out.println(Thread.currentThread().getName()+" is running");
//            Thread.yield();//gives more pattern based result
//        }
//    }



    public static void main(String[] args){
        ThreadInteruptYield y1=new ThreadInteruptYield("t1");
        y1.start();
        y1.interrupt();

//        ThreadInteruptYield y2=new ThreadInteruptYield("t1");
//        ThreadInteruptYield y3=new ThreadInteruptYield("t2");
//
//        y2.start();
//        y3.start();
    }

}
