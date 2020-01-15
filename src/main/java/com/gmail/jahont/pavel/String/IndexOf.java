package com.gmail.jahont.pavel.String;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IndexOf {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String args[]) {
        String str = new String("Pavel Jahont");

        logger.info("Found Index :");
        logger.info(str.indexOf('o'));
        logger.info("Found Index :");
        logger.info(str.indexOf('o', 10));
    }
}