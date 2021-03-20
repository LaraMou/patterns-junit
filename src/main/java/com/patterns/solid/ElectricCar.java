package com.patterns.solid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ElectricCar implements ICar{

    private int battery;
    private final Logger log = LogManager.getLogger(ElectricCar.class);

    @Override
    public void accelerate() {
        if (hasBattery()) {
            log.debug("accelerating the car");
        } else {
            log.debug("I can not accelerate the car");
        }
    }

    @Override
    public void stop() {
        log.debug("accelerating the car");
    }

    public boolean hasBattery() {
        log.debug("checking battery");
        if (battery < 95) {
            log.debug("the battery is very low :(");
            return false;
        } else {
            log.debug("battery OK :)");
            return true;
        }
    }
}
