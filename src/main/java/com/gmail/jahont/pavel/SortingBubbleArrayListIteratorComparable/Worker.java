package com.gmail.jahont.pavel.SortingBubbleArrayListIteratorComparable;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Worker {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    int id, date;
    private String name, surname, position;

    public Worker(int id, String name, String surname, int date, String position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public int getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "ID: " + id + "| Name: " + name + "| Surname: " + surname + "| Date: " + date + "| Position: " + position;
    }
}