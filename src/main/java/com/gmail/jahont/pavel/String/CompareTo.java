package com.gmail.jahont.pavel.String;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompareTo {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String args[]) {
        String str1 = "MyNameIsPaveL12345";
        String str2 = "MyNameIsPaveL";

        int result = str1.compareTo(str2);   //5
        logger.info(result);
    }
}