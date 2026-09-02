package com.example;

public class petrolEngine implements Engine {


    public petrolEngine(){
        System.out.println("Petrol Engine Constructor");
    }
    @Override
    public void start() {
        System.out.println("Petrol Engine Started");
    }
}
