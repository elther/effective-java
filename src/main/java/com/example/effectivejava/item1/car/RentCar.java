package com.example.effectivejava.item1.car;

public class RentCar implements Car{
    private static RentCar rentCar;
    private String name = "tesla";

    public static RentCar getRentCar(){
        if(rentCar == null){
            rentCar = new RentCar();
            return rentCar;
        }
        return rentCar;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println(name +" drive");
    }
}
