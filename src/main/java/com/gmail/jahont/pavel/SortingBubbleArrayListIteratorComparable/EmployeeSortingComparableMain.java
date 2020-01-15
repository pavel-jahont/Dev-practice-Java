package com.gmail.jahont.pavel.SortingBubbleArrayListIteratorComparable;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmployeeSortingComparableMain {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        EmployeeSortingComparable clerk1 = new EmployeeSortingComparable(4, "Olga", "Pankovec", "Developer");
        EmployeeSortingComparable clerk2 = new EmployeeSortingComparable(2, "Natalia", "Bakunovskaya", "QA Engineer");
        EmployeeSortingComparable clerk3 = new EmployeeSortingComparable(1, "Artem", "Moscalevich", "Developer");
        EmployeeSortingComparable clerk4 = new EmployeeSortingComparable(3, "Pavel", "Jahont", "QA Engineer");
        EmployeeSortingComparable clerk5 = new EmployeeSortingComparable(5, "Alexey", "Buben", "Developer");

        ArrayList<EmployeeSortingComparable> employees = new ArrayList<>();
        employees.add(clerk1);
        employees.add(clerk2);
        employees.add(clerk3);
        employees.add(clerk4);
        employees.add(clerk5);

        Iterator it = employees.iterator();
        while (it.hasNext()) {
            logger.info(it.next());
        }

        Collections.sort(employees);
        logger.info("----------------------------------------------------");

        Iterator it1 = employees.iterator();
        while (it1.hasNext()) {
            logger.info(it1.next());
        }
    }
}