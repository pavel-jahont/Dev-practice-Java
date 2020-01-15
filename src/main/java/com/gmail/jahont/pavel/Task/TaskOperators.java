package com.gmail.jahont.pavel.Task;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskOperators {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public void runTaskOperators() {
        boolean c;
        c = true | true;
        logger.info("true | true -> " + c);
        c = true | false;
        logger.info("true | false -> " + c);
        c = false | true;
        logger.info("false | true -> " + c);
        c = false | false;
        logger.info("false | false -> " + c);
        //----------------------------------------//
        c = true || true;
        logger.info("true || true -> " + c);
        c = true || false;
        logger.info("true || false -> " + c);
        c = false || true;
        logger.info("false || true -> " + c);
        c = false || false;
        logger.info("false || false -> " + c);
        //----------------------------------------//
        c = true ^ true;
        logger.info("true ^ true -> " + c);
        c = true ^ false;
        logger.info("true ^ false -> " + c);
        c = false ^ true;
        logger.info("false ^ true -> " + c);
        c = false ^ false;
        logger.info("false ^ false -> " + c);
        //----------------------------------------//
        c = true != true;
        logger.info("true != true -> " + c);
        c = true != false;
        logger.info("true != false -> " + c);
        c = false != true;
        logger.info("false != true -> " + c);
        c = false != false;
        logger.info("false != false -> " + c);
        //----------------------------------------//
        c = true & true;
        logger.info("true & true -> " + c);
        c = true & false;
        logger.info("true & false -> " + c);
        c = false & true;
        logger.info("false & true -> " + c);
        c = false & false;
        logger.info("false & false -> " + c);
        //----------------------------------------//
        c = true == true;
        logger.info("true == true -> " + c);
        c = true == false;
        logger.info("true == false -> " + c);
        c = false == true;
        logger.info("false == true -> " + c);
        c = false == false;
        logger.info("false == false -> " + c);
        //----------------------------------------//
    }
}