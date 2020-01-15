package com.gmail.jahont.pavel.Generics;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleGenericSecond<T, V> {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    private T ob1;
    private V ob2;

    public SimpleGenericSecond(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    public static void main(String[] args) {
        SimpleGenericSecond<Integer, String> tgObj = new SimpleGenericSecond<>(100, "Generics");
        tgObj.showType();
        logger.info(tgObj.getOb1());
        logger.info(tgObj.getOb2());
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    void showType() {
        logger.info("Type T is : " + ob1.getClass().getName());
        logger.info("Type V is : " + ob2.getClass().getName());
    }
}