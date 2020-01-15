package com.gmail.jahont.pavel.Collection;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class IteratorGoOverCollectionAndCompareEnum {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        List<Object> collection = new ArrayList<Object>();
        collection.add("Spain");
        collection.add("Italy");
        collection.add("Portugal");
        collection.add("Poland");
        collection.add("Germany");
        iter(collection);
    }

    public static void iter(Collection<Object> collection) {
        Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object country = iterator.next();
            try {
                Assert.assertTrue(Country.checkIsValueInEnum(country), country + " should be in enum:    ");
            } catch (AssertionError e) {
                logger.info(e);
            }
        }
    }
}