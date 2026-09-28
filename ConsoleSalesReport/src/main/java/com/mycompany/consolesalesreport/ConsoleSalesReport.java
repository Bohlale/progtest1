/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolesalesreport;

/**
 *
 * @author st10516156
 */
public class ConsoleSalesReport {
    public static void main(String[] args) {
        
        // Declare and populate the single dimensional array for cities
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        
        //  Declare and populate the two dimensional array for sales
        // Rows represent cities, columns represent PS5, XBOX, SWITCH
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };
        
        // Array to store the total sales for each city
        int[] cityTotals = new int[3];
        
        // --- Print the Main Report ---
        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-16s %-8s %-8s %-8s\n", "", "PS5", "XBOX", "SWITCH");
        
        // Loop through the 2D array to print the table and calculate totals
        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-16s", cities[i]);
            
            int rowTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-8d", sales[i][j]);
                rowTotal += sales[i][j]; // Add to row total
            }
            cityTotals[i] = rowTotal; // Store the total for this city
            System.out.println(); // Move to next line
        }
        
        // --- Print the Totals Section ---
        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");
        
        int maxSales = 0;
        String bestCity = "";
        
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-16s %d\n", cities[i], cityTotals[i]);
            
            // Check if this city has the most sales so far
            if (cityTotals[i] > maxSales) {
                maxSales = cityTotals[i];
                bestCity = cities[i];
            }
        }
        
        // --- Print the Final Result ---
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + bestCity);
        System.out.println("--------------------------------------------------");
    }
}