package com.corejava.example.exceptionhandling;

class T {
    public void show() throws ClassNotFoundException{
           Class.forName("Gfesd");
    }

}

public class ThrowsKeyword {
    public static void main(String[] args){
              T trw= new T();
        try {
            trw.show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);

        }
    }
}
