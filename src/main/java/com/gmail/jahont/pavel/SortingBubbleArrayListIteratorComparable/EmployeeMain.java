package com.gmail.jahont.pavel.SortingBubbleArrayListIteratorComparable;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmployeeMain {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        Employee worker1 = new Employee(1, "Artem", "Moscalevich", "Developer");
        Employee worker2 = new Employee(2, "Natalia", "Bakunovskaya", "QA Engineer");
        Employee worker3 = new Employee(3, "Pavel", "Jahont", "QA Engineer");
        Employee worker4 = new Employee(4, "Olga", "Pankovec", "Developer");
        Employee worker5 = new Employee(5, "Alexey", "Buben", "Developer");

        ArrayList<Employee> workers = new ArrayList();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker4);
        workers.add(worker5);

        Random r = new Random();
        logger.info(workers.get(r.nextInt(4) + 1).getName());

        Iterator it = workers.iterator();
        while (it.hasNext()) {
            logger.info(it.next());
        }
    }
}