package com.gmail.jahont.pavel.String;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EndWith {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String args[]) {
        String str = new String("IT-Academy : Java for Automation Engineer");
        boolean retVal;

        retVal = str.endsWith("Engineer");
        logger.info("Returned Value = " + retVal); //true

        retVal = str.endsWith("neer");
        logger.info("Returned Value = " + retVal); //true
    }
}