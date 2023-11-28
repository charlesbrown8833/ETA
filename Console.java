/*
Charles Brown
CITC-1311-C01
November 9, 2023
*/
package arrivaltimeapp;

import java.util.Scanner;

public class Console {
    //Initialize Scanner variable
    private static final Scanner sc = new Scanner(System.in);
    //Validate String Entry
    public static String getString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();  
    }
    //Validate Int Entry
    public static int getInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Error! Invalid integer value.");
            }
        }
    }
    //Validate Int Entry
    public static int getInt(String prompt, int min, int max) {
        while (true) {
            int value = getInt(prompt);
            if (value > min && value < max) {
                return value;
            } else {
                System.out.println("Error! Number must be greater than " 
                        + min + " and less than " + max + ".");
            } 
        }
    }
    //Validate Double Entry
    public static double getDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Error! Invalid integer value.");
            }
        }
    }
    //Validate Double Entry
    public static double getDouble(String prompt, double min, double max) {
        while (true) {
            double value = getDouble(prompt);
            if (value > min && value < max) {
                return value;
            } else {
                System.out.println("Error! Number must be greater than " 
                        + min + " and less than " + max + ".");
            } 
        }
    }
}
