package org.example;

import java.util.LinkedHashMap;

public class BestCharge {
    public static void findBestCharge(PriceInput priceInput) {
        LinkedHashMap<String, Integer> priceInterval = priceInput.getPriceInterval();

        if (priceInterval.isEmpty()) {
            System.out.println("Skriv in priser först.");
            return;
        }

        String bestTimeRange = null;
        int bestTotalPrice = Integer.MAX_VALUE;

        for (int startHour = 0; startHour < 24; startHour++) {
            int totalPrice = 0;

            for (int hour = startHour; hour < startHour + 4; hour++) {
                String timeInterval = String.format("%02d-%02d", hour % 24, (hour + 1) % 24);
                totalPrice += priceInterval.getOrDefault(timeInterval, 0);
            }

            if (totalPrice < bestTotalPrice) {
                bestTotalPrice = totalPrice;
                bestTimeRange = String.format("%02d-%02d", startHour % 24, (startHour + 3) % 24);
            }
        }

        if (bestTimeRange != null) {
            System.out.println("Bästa fyra timmarna: " + bestTimeRange);
            System.out.println("Totala priset: " + bestTotalPrice);
        } else {
            System.out.println("Något har gått snett, försök igen från början.");
        }
    }
}
