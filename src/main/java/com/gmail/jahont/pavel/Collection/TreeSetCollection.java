package com.gmail.jahont.pavel.Collection;

import java.lang.invoke.MethodHandles;
import java.util.TreeSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TreeSetCollection {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(456);
        treeSet.add(-74);
        treeSet.add(54);
        treeSet.add(496);
        treeSet.add(7486);
        treeSet.add(41);

        logger.info(treeSet);
    }
}