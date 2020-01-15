package com.gmail.jahont.pavel.String;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ToUpperCase {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String args[]) {
        String Str = new String("pAveL JahONt");
        logger.info(Str.toUpperCase());
    }
}