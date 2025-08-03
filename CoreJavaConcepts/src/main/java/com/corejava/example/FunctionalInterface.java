package com.corejava.example;

@java.lang.FunctionalInterface
interface  A{
    void show(int i,long j);
}
interface C{
   int add(int i, int j);
}
//class B implements A{
//    public  void show(){
//        System.out.println("Instance of B implementing A is created");
//    }
//}

public class FunctionalInterface {

    public static void main(String[] args){

        //Anonymous inner class
        A obj =(i, j) -> System.out.println("Anonymous inner class created : "+i + "////" +j);
        obj.show(5,900800000);

        C lambda = (i,j) -> (i + j+2);

        int rs= lambda.add(2,34);
        System.out.println(rs );


    }
}
