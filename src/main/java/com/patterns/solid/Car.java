package com.patterns.solid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Car implements ICar{
    private final Logger log = LogManager.getLogger(Car.class);
    @Override
    public void accelerate() {
        log.debug("accelerating the car");
       }

    @Override
    public void stop() {
        log.debug("stopping the car");
    }
}
