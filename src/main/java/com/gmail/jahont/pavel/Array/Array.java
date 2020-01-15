package com.gmail.jahont.pavel.Array;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Array {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String args[]) {
        int daysInMonth[];
        daysInMonth = new int[12];
        daysInMonth[0] = 31;
        daysInMonth[1] = 28;
        daysInMonth[2] = 31;
        daysInMonth[3] = 30;
        daysInMonth[4] = 31;
        daysInMonth[5] = 30;
        daysInMonth[6] = 31;
        daysInMonth[7] = 31;
        daysInMonth[8] = 30;
        daysInMonth[9] = 31;
        daysInMonth[10] = 30;
        daysInMonth[11] = 31;
        {
            logger.info("In May " + daysInMonth[4] + " days");
        }
    }
}