package com.gmail.jahont.pavel.String;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Equals {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String args[]) {
        String str1 = new String("Java for Automation Engineer");
        String str2 = str1;
        String str3 = new String("Java for Automation Engineer");
        boolean compare1;

        compare1 = str1.equals(str2);
        logger.info("Returned Value = " + compare1);  //true

        compare1 = str1.equals(str3);
        logger.info("Returned Value = " + compare1);  //true
    }
}