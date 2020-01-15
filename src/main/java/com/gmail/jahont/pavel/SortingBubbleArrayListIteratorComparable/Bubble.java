package com.gmail.jahont.pavel.SortingBubbleArrayListIteratorComparable;

import java.lang.invoke.MethodHandles;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bubble {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        int[] arr = new int[10];
        initArray(arr);
        initArrayByHands(arr);
        sortMyArray(arr);
        showMyArray(arr);
    }

    public static void initArrayByHands(int[] arr) {
        for (int i = 9; i >= 0; i--) {
            Scanner in = new Scanner(System.in);
            try {
                arr[i] = in.nextInt();
            } catch (InputMismatchException err) {
                logger.info("ONLY INTEGERS, PLEASE!");
            }
        }
    }

    public static void initArray(int[] arr) {
        for (int i = 9; i >= 0; i--) {
            Random r = new Random();
            int randomInt = r.nextInt(666);
            arr[i] = randomInt;
        }
    }

    public static void sortMyArray(int[] arr) {
        for (int iterationAmount = arr.length - 1; iterationAmount >= 0; iterationAmount--) {
            for (int element = 0; element < iterationAmount; element++) {
                if (arr[element] > arr[element + 1]) {
                    int buffer = arr[element];
                    arr[element] = arr[element + 1];
                    arr[element + 1] = buffer;
                }
            }
        }
    }

    public static void showMyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            logger.info(arr[i] + "  ");
        }
    }
}