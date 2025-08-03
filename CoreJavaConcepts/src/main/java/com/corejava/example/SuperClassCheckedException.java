package com.corejava.example;

class SuperClass1{
    void method(){
        System.out.println("Superclass method executed");
    }
}

public class SuperClassCheckedException extends SuperClass1{
    @Override
   // void method() throws IOException {
    void method() throws ArithmeticException{
        System.out.println("Subclass method executed");

    }
    public static void main(String [] args){
        SuperClass sup1=new SuperClassSubClassExcepnHandling();
        try{
            sup1.method();
            throw new ArithmeticException();
        }
        catch(ArithmeticException ae){
            System.out.println("Caught exception : "+ ae.getMessage());
        }
    }
}
