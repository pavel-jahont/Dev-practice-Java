package com.gmail.jahont.pavel.Collection;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.PriorityQueue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PriorityQueueCollection {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer("001");
        priorityQueue.offer("002");
        priorityQueue.offer("003");
        priorityQueue.offer("0012");
        priorityQueue.offer("005");
        priorityQueue.offer("0061");
        priorityQueue.offer("007");
        priorityQueue.offer("008");
        logger.info(priorityQueue);

        priorityQueue.poll();
        logger.info(priorityQueue);
        priorityQueue.poll();
        logger.info(priorityQueue);

        Iterator<String> it = priorityQueue.iterator();

        for (String a : priorityQueue) {
            logger.info(it.next());
        }
    }
}