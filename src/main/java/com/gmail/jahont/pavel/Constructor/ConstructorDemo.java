package com.gmail.jahont.pavel.Constructor;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructorDemo {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        Constructor mybox1 = new Constructor(15, 15, 12);
        Constructor mybox2 = new Constructor(10, 7, 25);
        double vol;

        vol = mybox1.volume();
        logger.info("The volume of the first is:  " + vol);
        vol = mybox2.volume();
        logger.info("The volume of the second is" + vol);
    }
}