package com.corejava.example;//final finalize finally

class FinalFinallyFinalize {
    public static void main (String[] args){
        // int a=9;
        // a++;
        // final int b=2;
        // b++;compile time error

    try {
        System.out.println("inside try block");
        int result=100/0;
    }
    catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }
    finally{
        System.out.println("inside finally block");
    }


    }
}