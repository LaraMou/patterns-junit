package com.patterns.solid;

public class Main {

    public static void main(String[] args) {

        String carType = "electric";

        if(carType.equals("car")){
            new Car();
        } else if (carType.equals("electric")){
            new ElectricCar();

        }else{
            throw new RuntimeException("Invalid car");
        }

    }
}
