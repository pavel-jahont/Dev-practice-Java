package com.gmail.jahont.pavel.Task;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskSalaryCycleFor {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public void runTaskSalaryCycleFor() {
        int salary = 800;

        for (int i = 1; i <= 12; i++) {
            logger.info(salary);
            salary += 1000;
        }
    }
}