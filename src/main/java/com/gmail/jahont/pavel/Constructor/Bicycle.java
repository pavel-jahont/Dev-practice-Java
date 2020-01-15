package com.gmail.jahont.pavel.Constructor;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bicycle {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    int cadence = 0;
    int gear = 1;
    int speed = 0;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        logger.info("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}