package com.gmail.jahont.pavel.Generics;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SynthesisMethod {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        if (isIn(2, nums)) {
            logger.info("number 2 contained in nums");
        }
        if (!isIn(7, nums)) {
            logger.info("number 7 isn't contained in nums");
        }
        String stringsArr[] = {"one", "two", "three", "four", "five"};
        if (isIn("two", stringsArr)) {
            logger.info("number two contained in stringsArr");
        }
    }

    /*
    Synthesis method
     */
    static <T, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }
}