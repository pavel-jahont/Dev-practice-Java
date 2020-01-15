package com.gmail.jahont.pavel.Array;

import java.lang.invoke.MethodHandles;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayControlPanel {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        String[] array = new String[10];
        array[0] = "Discovery";
        array[1] = "EuroSport";
        array[2] = "EuroNews";
        array[3] = "TNT";
        array[4] = "My planet";
        array[5] = "8 chanel";
        array[6] = "ONT";
        array[7] = "Hunting & Fishing";
        array[8] = "KHL";
        array[9] = "KHL Live";
        int clickNumber;
        Scanner input = new Scanner(System.in);
        {
            logger.info("Press the button on the remote control from 1 to 10 inclusive: ");
            clickNumber = input.nextInt();
            clickNumber--;
        }
        if (0 <= clickNumber && clickNumber <= 9) {
            logger.info("You are watching the channel: " + array[clickNumber]);
        } else {
            logger.info("There is no such channel");
        }
    }
}