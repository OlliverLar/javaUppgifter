package org.example;

import java.util.Scanner; //importing scanner class

public class Menu {
    public static void menu() {
        Scanner selector = new Scanner(System.in);
        boolean exit = false;

        PriceInput priceInput = new PriceInput();

        while (!exit) {
            //Menu options
            System.out.println("Elpriser");
            System.out.println("========");
            System.out.println("1. Inmatning");
            System.out.println("2. Min, Max och Medel");
            System.out.println("3. Sortera");
            System.out.println("4. Bästa laddningstid (4h)");
            System.out.println("e. Avsluta");
            String selectedOption = selector.nextLine();

            // Handling input from user
            switch (selectedOption) {
                case "e", "E" -> {
                    System.out.println("Programmet avslutades");
                    exit = true;
                }
                case "1" -> {
                    priceInput.price();
                }
                case "2" -> {
                    MinMax.minmax(priceInput);
                }
                case "3" -> {
                    printSorted.printsorted(priceInput);
                }
                case "4" -> {
                    BestCharge.findBestCharge(priceInput);
                }
                default -> {
                    System.out.println("Ogiltigt val, försök igen!");
                }
            }
        }
        selector.close();
    }
}
