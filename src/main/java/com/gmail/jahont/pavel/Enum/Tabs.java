package com.gmail.jahont.pavel.Enum;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Tabs {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public void clickOnTab(TabsTypes type) {
        switch (type) {
            case SURNAME:
                logger.info(type);
                break;
            case NAME:
                logger.info(type);
                break;
            case PATRONYMIC:
                logger.info(type);
                break;
            case AMSTERDAM:
                logger.info(type);
                break;
        }
    }

    public enum TabsTypes {
        SURNAME("JAHONT"),
        NAME("PAVEL"),
        PATRONYMIC("VLADIMIROVICH"),
        AMSTERDAM("AMSTERDAM");
        String name;

        TabsTypes(String name) {
            this.name = name;
        }

        public String toString() {
            return this.name;
        }
    }
}