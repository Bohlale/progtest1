/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.consolesalesreport;

/**
 *
 * @author serog
 */
import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu
        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        
        System.out.print("\n"); // Just for spacing like the screenshot
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        String consoleType = "";
        
        // Determine console type based on choice
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to PS5.");
                consoleType = "PS5";
        }

        // Get store name
        System.out.print("Enter the store: ");
        String storeName = scanner.nextLine();

        // Get total sales
        System.out.print("Enter the total sales of " + consoleType + " consoles for " + storeName + ": ");
        int totalSales = scanner.nextInt();

        // Represent the ConsoleSales object
        ConsoleSales sale = new ConsoleSales(consoleType, storeName, totalSales);

        // Print the final report
        System.out.println(); // Blank line before report
        sale.printReport();

        scanner.close();
    }
}