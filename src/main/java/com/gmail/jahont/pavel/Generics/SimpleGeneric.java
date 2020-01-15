package com.gmail.jahont.pavel.Generics;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleGeneric<T> {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    private T ob;

    public SimpleGeneric(T o) {
        ob = o;
    }

    public static void main(String[] args) {
        SimpleGeneric<Integer> iOb = new SimpleGeneric<>(100);
        iOb.showType();
        SimpleGeneric strOb = new SimpleGeneric("generalized test");
        strOb.showType();
        SimpleGeneric<Double> dou = new SimpleGeneric<>(100.0);
        dou.showType();
    }

    public T getOb() {
        return ob;
    }

    void showType() {
        logger.info("Type T is :   " + ob.getClass().getName());
    }
}