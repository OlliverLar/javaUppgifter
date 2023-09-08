package org.example;

import java.util.*;

public class printSorted {
    public static void printsorted(PriceInput priceInput){
        LinkedHashMap<String, Integer> priceInterval = priceInput.getPriceInterval();

        if (priceInterval.isEmpty()) {
            System.out.println("Skriv in priser först.");
            return;
        }
        List<Map.Entry<String, Integer>> priceList = new ArrayList<>(priceInterval.entrySet());

        priceList.sort(Comparator.comparingInt(Map.Entry::getValue));
        System.out.println("Priserna sorterade:");
        for (Map.Entry<String, Integer> sortedPrice : priceList) {
            System.out.println("Tid: " + sortedPrice.getKey() + " Pris: " + sortedPrice.getValue() + " öre");
        }

    }
}
