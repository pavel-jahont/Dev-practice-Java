package com.gmail.jahont.pavel.Collection;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayListCollection {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {

        List<String> myArrayList = new ArrayList<String>(7);
        myArrayList.add("001");
        myArrayList.add("002");
        myArrayList.add("003");
        myArrayList.add("004");
        myArrayList.add("005");
        myArrayList.add("006");
        myArrayList.add("007");
        myArrayList.add("008");

        myArrayList.remove(3);
        logger.info("Fifth element of collection:  " + myArrayList.get(5));
        logger.info("Size:  " + myArrayList.size());
        //-----------------------------------------------------------------------------------------------
        String[] arr = new String[myArrayList.size()];
        myArrayList.toArray(arr);
        logger.info(arr);
        for (String a : arr) {
            logger.info(a);
        }
        //-----------------------------------------------------------------------------------------------
        Iterator<String> iterator = myArrayList.iterator();
        while (iterator.hasNext()) {
            logger.info(iterator.next());
        }

        ListIterator<String> listIterator = myArrayList.listIterator(2);
        logger.info("------------------------------");
        logger.info(listIterator.nextIndex());
        logger.info(listIterator.nextIndex());
        listIterator.add("0002");
        logger.info(listIterator.nextIndex());
        listIterator.next();
        logger.info(listIterator.nextIndex());
        logger.info("------------------------------");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("001");
        linkedList.add("002");
        linkedList.add("003");
        linkedList.add("004");
        linkedList.add("005");
        linkedList.add("006");
        linkedList.add("007");
        linkedList.add("008");
    }
}