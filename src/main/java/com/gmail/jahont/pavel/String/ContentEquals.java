package com.gmail.jahont.pavel.String;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ContentEquals {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String args[]) {
        String str1 = "PavelJahont";
        String str2 = "Pavel Jahont";
        StringBuffer str3 = new StringBuffer("Pavel_Jahont");

        boolean result = str1.contentEquals(str3);
        logger.info(result); //false

        result = str2.contentEquals(str3);
        logger.info(result); //false
    }
}