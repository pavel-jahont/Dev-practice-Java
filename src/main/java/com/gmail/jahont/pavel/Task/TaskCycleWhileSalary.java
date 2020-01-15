package com.gmail.jahont.pavel.Task;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskCycleWhileSalary {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public void runCycleWhileSalary() {
        int salary = 800;
        int month = 1;

        while (month <= 12) {
            logger.info(salary);
            salary += 1000;
            month++;
        }
    }
}