package com.example.effectivejava.item1.car;

public class Client {

    public static void main(String[] args) {
        Car car1 = CarFactory.createNewMuscleCar("dodge");
        Car car2 = CarFactory.createNewRacingCar("911");
        Car car3 = CarFactory.createNewTruck("poter");
        Car car4 = CarRentStore.rentCar("tesla");
        Car car5 = CarRentStore.rentCar("tesla");
        Car car6 = CarFactory.getMalibu();

        car1.drive();
        car2.drive();
        car3.drive();
        car4.drive();
        car5.drive();

        System.out.println(car4);
        System.out.println(car5);
    }
}
