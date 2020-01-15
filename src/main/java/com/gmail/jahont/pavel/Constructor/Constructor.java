package com.gmail.jahont.pavel.Constructor;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Constructor {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    double depth;
    double height;
    double width;

    Constructor(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}