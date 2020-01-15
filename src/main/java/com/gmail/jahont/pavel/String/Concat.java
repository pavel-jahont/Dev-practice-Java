package com.gmail.jahont.pavel.String;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Concat {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String args[]) {
        String str1 = "My Hobby:";
        str1 = str1.concat(" Aviation and Hockey");
        logger.info(str1); // My Hobby: Aviation and Hockey
    }
}