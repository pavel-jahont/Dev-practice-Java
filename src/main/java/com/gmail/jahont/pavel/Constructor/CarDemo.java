package com.gmail.jahont.pavel.Constructor;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CarDemo {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

        int drive1;
        drive1 = car.drive(150);
        logger.info("Super:  " + drive1);
    }
}