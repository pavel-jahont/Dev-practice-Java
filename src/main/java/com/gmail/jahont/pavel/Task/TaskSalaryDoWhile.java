package com.gmail.jahont.pavel.Task;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskSalaryDoWhile {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public void runTaskSalaryDoWhile() {
        int salary = 800;
        int month = 1;

        do {
            logger.info(salary);
            salary += 1000;
        }
        while (month++ < 12);
    }
}