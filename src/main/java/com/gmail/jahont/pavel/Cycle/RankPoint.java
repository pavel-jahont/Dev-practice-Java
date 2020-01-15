package com.gmail.jahont.pavel.Cycle;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RankPoint {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        rankPoint(255.7);
    }

    public static void rankPoint(double points) {
        if (points >= 202.5) {
            logger.info("Rank:A1");
        } else if (points >= 122.4) {
            logger.info("Rank:A2");
        } else {
            logger.info("Rank:A3");
        }
    }
}