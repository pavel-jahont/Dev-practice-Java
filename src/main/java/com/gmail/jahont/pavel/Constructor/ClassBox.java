package com.gmail.jahont.pavel.Constructor;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClassBox implements iClassBox {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    double depth;
    double height;
    double width;

    @Override
    public void volume() {
        logger.info("Volume is equal:  " + width * height * depth);
    }
}