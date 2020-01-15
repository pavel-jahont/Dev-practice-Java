package com.gmail.jahont.pavel.Cycle;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class While {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        conditions();
    }

    public static void conditions() {
        while (haveTime() && haveMoney()) {
            goShopping();
        }
    }

    private static boolean haveMoney() {
        int my_money = 600;
        if (my_money > 500) {
            return true;
        }
        return false;
    }

    private static boolean haveTime() {
        int my_hours = 5;
        if (my_hours > 3) {
            return true;
        }
        return false;
    }

    private static void goShopping() {
        logger.info("Go shopping!");
    }
}
