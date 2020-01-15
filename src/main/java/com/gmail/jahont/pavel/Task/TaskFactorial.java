package com.gmail.jahont.pavel.Task;

import java.lang.invoke.MethodHandles;
import java.math.BigInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskFactorial {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public void runTaskFactorial() {
        logger.info(factorial(3));
    }

    public BigInteger factorial(int value) {
        BigInteger result = BigInteger.valueOf(value);
        if (value <= 0) {
            return BigInteger.ZERO;
        }
        while (value != 1) {
            result = result.multiply(BigInteger.valueOf(value).subtract(BigInteger.ONE));
            --value;
        }
        return result;
    }
}