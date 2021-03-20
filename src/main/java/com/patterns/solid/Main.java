package com.patterns.solid;

public class Main {

    public static void main(String[] args) throws InvalidExceptionCar {

        String carType = "electric";

        if(carType.equals("car")){
            new Car();
        } else if (carType.equals("electric")){
            new ElectricCar();

        }else{

            throw new InvalidExceptionCar("Invalid car");
        }

    }

}
