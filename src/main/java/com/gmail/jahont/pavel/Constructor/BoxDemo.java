package com.gmail.jahont.pavel.Constructor;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class BoxDemo {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        ClassBox mybox = new ClassBox();
        double vol;

        mybox.width = 100;
        mybox.height = 200;
        mybox.depth = 300;
        vol = mybox.width * mybox.height * mybox.depth;
        logger.info("Volume is equal:  " + vol);
    }
}