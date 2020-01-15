package com.gmail.jahont.pavel.Task;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskDialogue {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public void runTaskDialog() {
        boolean building = true;
        boolean operator = false;
        int dinner = 3;
        {
            logger.info("Hello, lady!");
            logger.info("Tell me, am I heading to the MTS building correctly?");
        }
        if (building) {
            logger.info("YES");
        } else {
            logger.info("NO");
        }
        {
            logger.info("Are there any other buildings with offices of mobile operators nearby?");
        }
        if (operator) {
            logger.info("YES");
        } else {
            logger.info("NO");
        }
        {
            logger.info("May I invite you to dine together?");
        }
        if (dinner == 3) {
            logger.info("YES");
        } else {
            logger.info("NO");
        }
    }
}