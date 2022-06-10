package com.example.effectivejava.item1.car;

public class RacingCar implements Car{
    String name;

    public RacingCar(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println(name +" drive");
    }
}
