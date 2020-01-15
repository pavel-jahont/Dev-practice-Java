package com.gmail.jahont.pavel.Array;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MultuArraysFor {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        int[][] firstArray;
        firstArray = new int[2][3];

        firstArray[0][0] = 7;
        firstArray[0][1] = 45;
        firstArray[0][2] = 3;
        firstArray[1][0] = 49;
        firstArray[1][1] = 18;
        firstArray[1][2] = -8;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                logger.info(firstArray[i][j] + "\t");
            }
        }
    }
}