package com.corejava.example;

class SuperClass{
    void method(){
        System.out.println("Superclass method executed");
    }
}

public class SuperClassSubClassExcepnHandling extends SuperClass{

    @Override
    void  method() throws ArithmeticException{
        System.out.println("Subclass method executed");
        //throw new ArithmeticException("Exception in subclass");
    }
    public static void main(String[] args){
        SuperClass sup = new SuperClass();
        try{
            sup.method();
        }
        catch(ArithmeticException ae){
            System.out.println("Caught exception"+ ae.getMessage());
        }

    }

}
