package com.example.effectivejava.item1.car;

public class Truck implements Car{
    String name;

    public Truck(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println(name +" drive");
    }
}
