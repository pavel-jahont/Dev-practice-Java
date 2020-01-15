package com.gmail.jahont.pavel.SortingBubbleArrayListIteratorComparable;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Employee {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    private int id;
    private String name, surname, position;

    public Employee(int id, String name, String surname, String position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
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

    @Override
    public String toString() {
        return "ID: " + id + "| Name: " + name + "| Surname: " + surname + "| Position: " + position;
    }
}