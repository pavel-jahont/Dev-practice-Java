package com.gmail.jahont.pavel.Constructor;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CarSecond extends Car {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {

        CarSecond car1 = new CarSecond();

        int drive1;
        drive1 = car1.drive(200);
        logger.info("Super:  " + drive1);
    }
}