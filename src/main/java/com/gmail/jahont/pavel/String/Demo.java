package com.gmail.jahont.pavel.String;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String args[]) {
        char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
        String helloString = new String(helloArray);
        logger.info(helloString); // hello.
    }
}