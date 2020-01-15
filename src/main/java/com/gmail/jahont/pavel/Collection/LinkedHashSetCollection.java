package com.gmail.jahont.pavel.Collection;

import java.lang.invoke.MethodHandles;
import java.util.LinkedHashSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedHashSetCollection {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("0018");
        linkedHashSet.add("002");
        linkedHashSet.add("003");
        linkedHashSet.add("004");
        linkedHashSet.add("005");
        logger.info(linkedHashSet);
    }
}