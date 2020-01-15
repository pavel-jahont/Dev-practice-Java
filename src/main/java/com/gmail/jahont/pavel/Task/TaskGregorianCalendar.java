package com.gmail.jahont.pavel.Task;

import java.lang.invoke.MethodHandles;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskGregorianCalendar {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    private int year;
    private String months[] = {
            "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "Jul", "Aug",
            "Sep", "Oct", "Nov", "Dec"
    };

    /*
    Create a Gregorian calendar initialized with the current date and time in the default locale and timezone.
    */
    public void runTaskGregorianCalendar() {
        GregorianCalendar gcalendar = new GregorianCalendar();
        logger.info("Date: " + months[gcalendar.get(Calendar.MONTH)] + " " + gcalendar.get(Calendar.DATE) + " " + gcalendar.get(Calendar.YEAR));
        year = gcalendar.get(Calendar.YEAR);
        logger.info("Time: " + gcalendar.get(Calendar.HOUR) + ":" + gcalendar.get(Calendar.MINUTE) + ":" + gcalendar.get(Calendar.SECOND));
        if (gcalendar.isLeapYear(year)) {
            logger.info("The current year is a leap year");
        } else {
            logger.info("The current year is not a leap year");
        }
    }
}