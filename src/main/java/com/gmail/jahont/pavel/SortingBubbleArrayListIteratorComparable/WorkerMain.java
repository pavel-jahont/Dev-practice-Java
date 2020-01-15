package com.gmail.jahont.pavel.SortingBubbleArrayListIteratorComparable;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class WorkerMain {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        Worker clerk1 = new Worker(1, "Artem", "Moscalevich", 1988, "Developer");
        Worker clerk2 = new Worker(2, "Natalia", "Bakunovskaya", 1975, "QA Engineer");
        Worker clerk3 = new Worker(3, "Pavel", "Jahont", 1982, "QA Engineer");
        Worker clerk4 = new Worker(4, "Olga", "Pankovec", 1990, "Developer");
        Worker clerk5 = new Worker(5, "Alexey", "Buben", 1990, "Developer");
        Worker clerk6 = new Worker(6, "Rod", "Stewart", 1945, "Musician");
        Worker clerk7 = new Worker(7, "Barak", "Obama", 1961, "President");
        Worker clerk8 = new Worker(8, "AC", "Pushkin", 1799, "Poet");

        ArrayList<Worker> listOfClerks = new ArrayList<>();
        listOfClerks.add(clerk1);
        listOfClerks.add(clerk2);
        listOfClerks.add(clerk3);
        listOfClerks.add(clerk4);
        listOfClerks.add(clerk5);
        listOfClerks.add(clerk6);
        listOfClerks.add(clerk7);
        listOfClerks.add(clerk8);

        sortMyArrayList(listOfClerks);
        showMyArrayList(listOfClerks);
        logger.info("----------------------------------------------------------------------");
        showMyArrayListAfterYear(listOfClerks);
        logger.info("----------------------------------------------------------------------");
        showMyArrayListPosition(listOfClerks);
    }

    //--------Sort an ArrayList by date---------------------------------------------------------
    public static void sortMyArrayList(ArrayList<Worker> listOfClerks) {
        for (int i = listOfClerks.size() - 1; i >= 0; i--) {
            for (int z = 0; z < i; z++) {
                if (listOfClerks.get(z).date > listOfClerks.get(z + 1).date) {
                    Worker buffer = listOfClerks.get(z);
                    listOfClerks.set(z, listOfClerks.get(z + 1));
                    listOfClerks.set(z + 1, buffer);
                }
            }
        }
    }

    //---------Shows whole ArrayList---------------------------------------------------------------
    public static void showMyArrayList(ArrayList<Worker> listOfClerks) {
        for (Worker a : listOfClerks) {
            logger.info(a.toString());
        }
    }

    //---------Shows a list of clerks after defined year-------------------------------------------
    public static void showMyArrayListAfterYear(ArrayList<Worker> listOfClerks) {
        for (Worker a : listOfClerks) {
            if (a.date > 1950) {
                logger.info(a.toString());
            }
        }
    }

    //---------Shows a list of clerks of defined positionr------------------------------------------
    public static void showMyArrayListPosition(ArrayList<Worker> listOfClerks) {
        for (Worker a : listOfClerks) {
            if (a.getPosition().equals("Just dude")) {
                logger.info(a.toString());
            }
        }
    }
}