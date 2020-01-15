package com.gmail.jahont.pavel.Collection;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HashMapCollection {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Pavel", 37);
        hashMap.put("Andrey", 9);
        hashMap.put("Dasha", 8);
        hashMap.put("Gleb", 5);

        Set<Map.Entry<String, Integer>> arr = hashMap.entrySet();   //convert to Set for getting ability to iterate

        for (Map.Entry<String, Integer> a : arr) {
            logger.info(a.getKey());
        }
    }
}