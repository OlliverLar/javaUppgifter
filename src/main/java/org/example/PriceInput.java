package org.example;

import java.util.*;

public class PriceInput {
    public static void price() {
        Scanner inputScanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> priceInterval = new LinkedHashMap<>();
        String[] hoursArray = new String[24];

        for (int hour = 0; hour < 24; hour++) {
            int nextHour = (hour + 1) % 24;
            String timeInterval = String.format("%02d-%02d", hour, nextHour);
            hoursArray[hour] = timeInterval;
        }

        for (int ID = 0; ID < 24; ID++) {
            while (true) {
                System.out.println("Priset för: " + hoursArray[ID]);
                if (inputScanner.hasNextInt()) {
                    int price = inputScanner.nextInt();
                    priceInterval.put(hoursArray[ID], price);
                    break;
                } else {
                    System.out.println("Något är inte rätt, se till att du bara skrivit siffor!");
                    inputScanner.next();
                }
            }
        }
        for (String i : priceInterval.keySet()) {
            System.out.println("Tid: " + i + " Pris: " + priceInterval.get(i));
        }
    }
}
