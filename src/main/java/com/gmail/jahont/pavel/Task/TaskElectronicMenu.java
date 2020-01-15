package com.gmail.jahont.pavel.Task;

import java.lang.invoke.MethodHandles;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskElectronicMenu {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public void runTaskElectronicMenu() {
        int departureDate;
        int switchNumber = 0;

        Scanner input = new Scanner(System.in);
        logger.info(
                "To find the Minsk-Moscow train schedule for June, enter the departure time in hours (approximately the hour of departure). For example: 19");
        departureDate = input.nextInt();

        logger.info(departureDate);
        if (0 < departureDate && departureDate < 6) {
            logger.info("Train timetable from 00.00 to 05.59");
            switchNumber = 1;
        } else if (6 <= departureDate && departureDate < 12) {
            logger.info("Train timetable from 06.00 to 11.59");
            switchNumber = 2;
        } else if (12 <= departureDate && departureDate < 18) {
            logger.info("Train timetable from 12.00 to 17.59");
            switchNumber = 3;
        } else if (18 <= departureDate && departureDate < 24) {
            logger.info("Train timetable from 18.00 to 23.59");
            switchNumber = 4;
        }

        switch (switchNumber) {
            case 1:
                logger.info(
                        "\nTrain number: 058Б  \nGrodno - St. Petersburg-Viteb.  \nDepart: 00:56 Minsk  \nArrival: 15:25 St. Petersburg   \nTravel time: 14 h 29 min");
                break;
            case 2:
                logger.info("\nThere are no trains at this time. Choose a different time if necessary.");
                break;
            case 3:
                logger.info(
                        "\nTrain Number: 022A  \nPrague Ch. - Cheb - Moscow Belarusian  \nDeparture: 14:20 Minsk  \nArrival: 07:23 St. Petersburg   \nTravel time: 17 h 03 min");
                break;
            case 4:
                logger.info(
                        "\nTrain number: 052Б   \nMinsk Passenger - St. Petersburg-Viteb.  \nDepart: 18:00 Minsk  \nArrival: 07:23 St. Petersburg   \nTravel time: 13 h 23 min");
                logger.info(
                        "\n\nTrain number: 050Б   \nBrest-Central - St. Petersburg-Viteb.   \nDeparture: 18:45 Minsk   \nArrival: 09:17 St. Petersburg   \nTravel time: 14 h 32 min");
                break;
            default:
                logger.info("\nYou have entered the departure time. Returned time is 0-24");
                break;
        }
    }
}