package com.example;

public class Car {
    private Engine engine;
    public Car(){
        System.out.println("Car Class Constructor");
    }

    public Car(Engine engine){
        System.out.println("Engine set via Constructor Injection");
        this.engine= engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("Engine Set via Setter Injection");
        this.engine = engine;
    }

    void starCar(){
        engine.start();
        System.out.println("Car Started");
    }

}
