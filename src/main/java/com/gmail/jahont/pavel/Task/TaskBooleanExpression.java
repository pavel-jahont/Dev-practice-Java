package com.gmail.jahont.pavel.Task;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskBooleanExpression {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        if (a == true && b == true && c == false && d == false) {
            return true;
        } else if (a == true && c == true && b == false && d == false) {
            return true;
        } else if (a == true && d == true && b == false && c == false) {
            return true;
        } else if (b == true && c == true && a == false && d == false) {
            return true;
        } else if (b == true && d == true && a == false && c == false) {
            return true;
        } else if (c == true && d == true && a == false && b == false) {
            return true;
        }
        return false;
    }

    public void runTaskBooleanExpression() {
        logger.info(booleanExpression(false, false, false, false));
        logger.info(booleanExpression(true, true, true, true));
        logger.info(booleanExpression(false, false, true, true));
    }
}