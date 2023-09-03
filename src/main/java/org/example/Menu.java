package org.example;

import java.util.Scanner; //importing scanner class

public class Menu {
    public static void menu() {

        //Menu options
        Scanner selector = new Scanner(System.in);
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
            }
            case "1" -> {

            }
            case "2" -> {

            }
            case "3" -> {

            }
            case "4" -> {

            }
        }



    }
}
