package com.gmail.jahont.pavel.Cycle;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Switch {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        runSwitch();
    }

    public static void runSwitch() {
        int digit = 0;
        String text;
        switch (digit) {
            case 0:
                text = "zero";
                break;
            case 1:
                text = "one";
                break;
            // ...
            default:
                text = "No";
        }
        logger.info(text);
        logger.info("Switch - will support branching by values:" +
                " char, String, enum, and integral except long");
    }
}
