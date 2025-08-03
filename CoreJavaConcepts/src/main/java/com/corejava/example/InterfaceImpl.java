package com.corejava.example;

interface Vehicle{
    double wheelBase();
}

class Car implements Vehicle{
    private double tyreSection;
    //constructer
    public Car(){this.tyreSection=8;}

    //2nd const
    public Car(double tyreSection){
        this.tyreSection=tyreSection;
    }

    @Override
    public double wheelBase(){
          System.out.println(tyreSection * 2);
          return tyreSection*2;
    }
}

public class InterfaceImpl {
    public static void main (String[] args) {
        Car car = new Car();
        car.wheelBase();
    }
}
