package com.gmail.jahont.pavel.util;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConversionTypeToType {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String args[]) {
        byte b;
        int i = 257;
        double d = 314.577;
        logger.info("\n Convert int to byte.");
        b = (byte) i;
        logger.info("i and b : " + i + " " + b);

        logger.info("\n Convert double to int.");
        i = (int) d;
        logger.info("d and i : " + d + " " + i);

        logger.info("\n Convert double to byte.");
        b = (byte) d;
        logger.info("d and b :  " + d + " " + b);
    }
}