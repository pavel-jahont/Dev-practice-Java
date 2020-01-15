package com.gmail.jahont.pavel.String;

import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GetBytes {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String args[]) {
        String str1 = new String("Anton Semenchenko");

        try {
            byte[] str2 = str1.getBytes();
            logger.info("Returned value " + str2);

            str2 = str1.getBytes("UTF-8");
            logger.info("Returned value " + str2);

            str2 = str1.getBytes("ISO-8859-1");
            logger.info("Returned value " + str2);
        } catch (UnsupportedEncodingException e) {
            logger.info("Unsupported character set");
        }
    }
}