import java.util.Scanner;

public class Lab1_T7n{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Display available items and their prices
        System.out.println("Item Type      Unit Price");
        System.out.println("Apple          : 300");
        System.out.println("Pineapple      : 500");
        System.out.println("Coconut        : 400");
        System.out.println("Oranges        : 100\n");

        // Ask for the number of items the user wants to buy
        System.out.println("Enter the number of items you want to buy:");
        int itemCount = read.nextInt();

        // Variable to keep track of the total bill
        int totalBill = 0;

        // Loop through the number of items the user wants to buy
        for (int i = 1; i <= itemCount; i++) {
            // Prompt the user for their choice of item
            System.out.println("\nEnter the number corresponding to the item:");
            System.out.println("1 - Apple");
            System.out.println("2 - Pineapple");
            System.out.println("3 - Coconut");
            System.out.println("4 - Oranges");
            int choice = read.nextInt();

            // Prompt the user for the quantity
            System.out.println("Enter the quantity:");
            int quantity = read.nextInt();

            // Calculate the cost for the chosen item
            switch (choice) {
                case 1: // Apple
                    totalBill += quantity * 300;
                    break;
                case 2: // Pineapple
                    totalBill += quantity * 500;
                    break;
                case 3: // Coconut
                    totalBill += quantity * 400;
                    break;
                case 4: // Oranges
                    totalBill += quantity * 100;
                    break;
                default: // Handle invalid input
                    System.out.println("Invalid choice. Please enter a valid item number.");
                    i--; // Repeat this iteration
                    break;
            }
        }

        // Display the total bill
        System.out.println("\nYour total bill is: " + totalBill);

        // Close the scanner
        read.close();
    }
}
