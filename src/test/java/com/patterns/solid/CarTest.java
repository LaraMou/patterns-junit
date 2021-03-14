package com.patterns.solid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car = new Car();
    @Test
    void accelerate() {

        car.accelerate();
        assertNotNull(car);
    }

    @Test
    void stop() {
        car.stop();
        assertNotNull(car);
    }
}