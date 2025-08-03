package com.corejava.example;

abstract class Remote {
    abstract  void turnOn();
    void next(){System.out.println("MUTED THE DEVICE");};;

}

class Tv extends Remote{
    @Override
    void turnOn(){
        System.out.println("ON TV");
    }

//    void next(){
//        System.out.println("NEXT SONG");
//    }

}

public class Abstraction {
    public  static  void main(String[] args){
        Remote tele= new Tv();
        tele.next();
        tele.turnOn();
    }
}
