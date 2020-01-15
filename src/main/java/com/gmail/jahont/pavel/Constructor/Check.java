package com.gmail.jahont.pavel.Constructor;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class User {

    private String Order;
    private String NumberOfServings;
    private double TotalPrice;

    User(String Order, String NumberOfServings, double TotalPrice) {
        this.Order = Order;
        this.NumberOfServings = NumberOfServings;
        this.TotalPrice = TotalPrice;
    }

    public String toString() {
        return this.Order + " " + this.NumberOfServings + ", " + this.TotalPrice;
    }
}

public class Check {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        User user = new User("Your order 190587     ", "Amount of servings 23       ", 46.69);
        logger.info(user);
    }
}