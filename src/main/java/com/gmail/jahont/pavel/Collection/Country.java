package com.gmail.jahont.pavel.Collection;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum Country {
    SPAIN("Spain"),
    ITALY("Italy"),
    PORTUGAL("Portugal");

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    private String value;

    Country(final String value) {
        this.value = value;
    }

    public static boolean checkIsValueInEnum(Object country) {
        boolean result = false;
        for (Country value : values()) {
            if (country.equals(value.getValue())) {
                result = true;
                break;
            } else {
                result = false;
            }
        }
        return result;
    }

    public static void valuesOfCountries() {
        logger.info(Country.values().toString());
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}