package com.gmail.jahont.pavel.util;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MinimumValue {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        double c = 7.3;
        double d = 9.4;
        int result1 = minFunction(a, b);
        // same function name with different parameters
        double result2 = minFunction(c, d);
        logger.info("Minimum Value = " + result1);
        logger.info("Minimum Value = " + result2);
    }

    // for integer
    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }

    // for double
    public static double minFunction(double n1, double n2) {
        double min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }
}