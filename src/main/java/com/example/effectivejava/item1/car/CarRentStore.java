package com.example.effectivejava.item1.car;

public class CarRentStore {
    private CarRentStore(){}

    public static Car rentCar(String name){
        return RentCar.getRentCar();
    }
}
