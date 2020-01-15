package com.gmail.jahont.pavel.Task;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskMergeTwoArrays {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];
        int y1 = 0;
        int y2 = 0;

        for (int i = 0; i < a3.length; i++) {
            if (y2 >= a2.length || y1 < a1.length && a1[y1] < a2[y2]) {
                a3[i] = a1[y1];
                y1++;
            } else {
                a3[i] = a2[y2];
                y2++;
            }
        }
        return a3;
    }

    public void runTaskMergeTwoArrays() {
        logger.info(Arrays.toString(mergeArrays(new int[] {200, 7, 1, 33}, new int[] {35, 109, 2, 4})));
    }
}