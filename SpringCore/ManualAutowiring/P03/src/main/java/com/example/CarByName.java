package com.example;

public class CarByName {
    private  Engine engine;
    public CarByName(){
        System.out.println("CarByName Constructor Created");

    }
    public CarByName(Engine engine){
        System.out.println("Engine Constructor Created");
        this.engine=engine;
    }

    public void setEngine(Engine engine) {

        this.engine = engine;
    }

    public void drive (){
        System.out.println("Car By Name");
        engine.start();
        System.out.println("Car is Running");
    }
}
