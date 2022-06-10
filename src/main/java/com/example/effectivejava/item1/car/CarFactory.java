package com.example.effectivejava.item1.car;

public class CarFactory {
    private CarFactory(){}

    public static Car createNewMuscleCar(String name){
        return new MuscleCar(name);
    }

    public static Car createNewRacingCar(String name){
        return new RacingCar(name);
    }

    public static Car createNewTruck(String name){
        return new Truck(name);
    }

    public static Car getMalibu(){
        return new Malibu();
    }
}
