package Javalab;
import java.util.Scanner;

public class stringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask how many strings the user wants to enter
        System.out.print("How many strings do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear the newline

        // Create the string array
        String[] names = new String[n];

        // Get strings from user
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            System.out.print("String " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Display the strings
        System.out.println("\nThe strings are:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }

        sc.close();
    }
}

