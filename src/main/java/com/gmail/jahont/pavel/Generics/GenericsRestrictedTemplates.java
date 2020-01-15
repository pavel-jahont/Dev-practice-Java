package com.gmail.jahont.pavel.Generics;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GenericsRestrictedTemplates<T extends Number> {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    private T[] nums;

    public GenericsRestrictedTemplates(T[] o) {
        nums = o;
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        GenericsRestrictedTemplates<Integer> iob = new GenericsRestrictedTemplates<>(nums);
        logger.info(iob.average());
        Double dnums[] = {1.0, 2.0, 3.0, 4.0, 5.0};
        GenericsRestrictedTemplates<Double> dob = new GenericsRestrictedTemplates<>(dnums);
        logger.info(dob.average());

        if (iob.sameAvg(dob)) {
            logger.info("equal");
        } else {
            logger.info("different");
        }
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(nums);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenericsRestrictedTemplates<?> stats = (GenericsRestrictedTemplates<?>) o;
        return Arrays.equals(nums, stats.nums);
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    boolean sameAvg(GenericsRestrictedTemplates<?> ob) {  // It's necessary use <?>, because it corresponds to any type
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }
}