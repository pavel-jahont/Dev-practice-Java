package com.gmail.jahont.pavel.Collection;

import java.lang.invoke.MethodHandles;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HashSetCollection {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        Set<Integer> hashSet1 = new HashSet<>();

        hashSet1.add(8);
        hashSet1.add(2);
        hashSet1.add(145);
        hashSet1.add(4);
        hashSet1.add(5);
        logger.info(hashSet1.add(5));
        logger.info(hashSet1);
        logger.info(hashSet1.size());

        Iterator<Integer> it = hashSet1.iterator();

        for (Integer a : hashSet1) {
            logger.info(it.next());
        }
    }
}