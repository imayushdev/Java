package com.example;

public class CarByType {
    private  Engine engine;
    public CarByType(){
        System.out.println("CarByType Constructor Created");

    }
    public CarByType(Engine engine){
        System.out.println("Engine Constructor Created");
        this.engine=engine;
    }

    public void setEngine(Engine engine) {

        this.engine = engine;
    }

    public void drive (){
        System.out.println("Car By Type");
        engine.start();
        System.out.println("Car is Running");
    }
}
