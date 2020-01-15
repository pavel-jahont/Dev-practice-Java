package com.gmail.jahont.pavel.Array;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayDouble {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        double[] arr1 = {1.9, 2.1, 3.8, 0.35};
        // Print all the array elements
        for (int i = 0; i < arr1.length; i++) {
            logger.info(arr1[i] + " ");
        }
        // Summing all elements
        double total = 0;
        for (int i = 0; i < arr1.length; i++) {
            total += arr1[i];
        }
        logger.info("Total is " + total);
        // Finding the largest element
        double max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        logger.info("Max is " + max);
    }
}