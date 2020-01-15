package com.gmail.jahont.pavel.Encapsulation;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EncapsulationGetSet {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    private int age;

    public static void main(String[] args) {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
}
