package com.gmail.jahont.pavel.Constructor;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Car {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public void start() {
        logger.info("Let's GO!");
    }

    public void stop() {
        logger.info("STOP!");
    }

    public int drive(int howlong) {
        int distance = howlong * 60;
        return distance;
    }

}
