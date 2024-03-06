package com.github.aastrandemma;

import com.github.aastrandemma.javaTime.JavaTimeExercises;
import com.github.aastrandemma.string.StringExercises;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        welcomeUser();
        do {
            displayMenu();
            int choice = getChoice();
            if (choice == 0) {
                System.out.println("Exiting the exercise application.");
                break;
            }
            getExercises(choice);
        } while (true);
    }

    private static void welcomeUser() {
        System.out.println("Welcome!\nChoose below which type of exercises you want to run.");
    }

    private static void displayMenu() {
        System.out.println("0: To exit the application.");
        System.out.println("1: String exercises.");
        System.out.println("2: Java Time Api exercises.");
    }

    private static int getChoice() {
        System.out.println("Enter choice:");
        Scanner scanner = new Scanner(System.in);
        int choice;
        if (!scanner.hasNextInt()) {
            System.out.println("The input is not a valid number.");
            choice = 999;
        } else {
            choice = scanner.nextInt();
        }
        return choice;
    }

    private static void getExercises(int choice) {
        switch (choice) {
            case 1:
                System.out.println("\nShowing you String exercise:");
                StringExercises.getStringExercises();
                System.out.println("\n");
                break;
            case 2:
                System.out.println("\nShowing you Java Time API exercise:");
                JavaTimeExercises.getJavaTimeExercises();
                System.out.println("\n");
                break;
            default:
                System.out.println("Enter a number from the menu. Enter 0 to exit the application.");
        }
    }
}