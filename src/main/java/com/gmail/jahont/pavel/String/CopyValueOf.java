package com.gmail.jahont.pavel.String;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CopyValueOf {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String args[]) {
        char[] str1 = {'J', 'a', 'v', 'a', ' ', 'A', 'u', 't', 'o', 'm', 'a', 't', 'i', 'o', 'n',};
        String str2 = "";

        str2 = str2.copyValueOf(str1);
        logger.info("Returned String: " + str2);  //Java Automatization

        str2 = str2.copyValueOf(str1, 2, 6);
        logger.info("Returned String: " + str2);  //va Aut
    }
}