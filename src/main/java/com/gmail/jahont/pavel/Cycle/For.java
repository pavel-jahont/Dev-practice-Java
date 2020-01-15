package com.gmail.jahont.pavel.Cycle;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class For {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {

        // First option
        for (int i = 0; i < args.length; i++) {
            logger.info(args[i]);
        }

        // Second option
        for (String arg : args) {
            logger.info(arg);
        }

        // FOR and IF with interruption inside
        String needle = "One";
        String[] haystack = {
                "Two",
                "Three",
                "Four",
                "Five",
                "Six",
                "Seven",
                "Eight",
                "One"
        };
        boolean found = false;
        for (String element : haystack) {
            logger.info(element);
            if (needle.equals(element)) {
                found = true;
                break;
            }
        }

        // For with counter
        int count = 0;
        for (String element : haystack) {
            if (!needle.equals(element)) {
                continue;
            }
            count++;
        }
    }
}