package com.gmail.jahont.pavel.Cycle;

public class Return {

    private static String getGreeting(String name) {
        if (name == null) {
            return "Hello anonymous!";
        } else {
            return "Hello " + name + "!";
        }
    }
}
