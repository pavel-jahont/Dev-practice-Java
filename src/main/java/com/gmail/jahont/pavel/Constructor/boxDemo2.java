package com.gmail.jahont.pavel.Constructor;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class boxDemo2 {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        ClassBox mybox1 = new ClassBox();
        ClassBox mybox2 = new ClassBox();
        double v1;

        mybox1.width = 30;
        mybox1.height = 35;
        mybox1.depth = 45;

        mybox2.width = 10;
        mybox2.height = 15;
        mybox2.depth = 2;

        v1 = mybox1.width * mybox1.height * mybox1.depth;
        logger.info("Volume is equal: " + v1);

        v1 = mybox2.width * mybox2.height * mybox2.depth;
        logger.info("Volume is equal: " + v1);
    }
}