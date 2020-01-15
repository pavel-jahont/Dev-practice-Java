package com.gmail.jahont.pavel.Constructor;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BoxDemo3 {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        ClassBox mybox1 = new ClassBox();
        ClassBox mybox2 = new ClassBox();

        mybox1.width = 55;
        mybox1.height = 12;
        mybox1.depth = 604;

        mybox2.width = 1;
        mybox2.height = 895;
        mybox2.depth = 9;

        mybox1.volume();
        mybox2.volume();
    }
}