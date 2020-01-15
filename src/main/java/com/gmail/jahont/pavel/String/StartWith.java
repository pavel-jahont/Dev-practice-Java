package com.gmail.jahont.pavel.String;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StartWith {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String args[]) {
        String str = new String("Operating systems: iOS, Android");

        logger.info(str.startsWith("Operati"));
        logger.info(str.startsWith("iOS"));
        logger.info(str.startsWith("ting", 5));
    }
}