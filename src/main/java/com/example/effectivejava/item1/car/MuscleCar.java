package com.example.effectivejava.item1.car;

public class MuscleCar implements Car{
    String name;

    public MuscleCar(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println(name +" drive");
    }
}
