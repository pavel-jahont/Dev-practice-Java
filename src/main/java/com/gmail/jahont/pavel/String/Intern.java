package com.gmail.jahont.pavel.String;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Intern {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String args[]) {
        String str1 = new String("- Manual testing: functional, regression, installation, acceptance, smoke, integration, GUI, exploratory;");
        String str2 = new String("- Requirements and specifications analysis;");

        logger.info("My Experience:");
        logger.info("- Test documentation development: test cases, check lists, test plans;");
        logger.info(str1.intern());

        logger.info("- Help and user guides revision and update;");
        logger.info(str2.intern());
    }
}