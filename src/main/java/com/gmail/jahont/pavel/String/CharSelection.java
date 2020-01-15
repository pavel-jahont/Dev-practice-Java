package com.gmail.jahont.pavel.String;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CharSelection {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String args[]) {
        String s = "Jahont Pavel Vladimirovych";
        char chars[] = {'P', 'A', 'V', 'E', 'L'};
        char charsSelection[] = {'J', 'A', 'H', 'O', 'N', 'T'};
        String w = new String(chars);
        String p = new String(charsSelection, 0, 2);
        int age = 37;
        String v = " I am " + age + " years old.";
        {
            logger.info(s);
            logger.info(s.length());
            logger.info("sss".length());
            logger.info(w);
            logger.info(p);
            logger.info(v);
        }
    }
}