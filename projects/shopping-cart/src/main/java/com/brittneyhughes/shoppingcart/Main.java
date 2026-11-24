package com.brittneyhughes.shoppingcart;

// [Start of Imports]
import java.util.Scanner;
// [End of Imports]

public class Main {
    public static void main(String[] args) {

        // [Initiate scanner]
        Scanner scanner = new Scanner(System.in);

        // [Variables]
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        // [Item]
        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        printSeparator();

        // [Price]
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        printSeparator();

        // [Quantity]
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        printSeparator();

        // [Total Calculation]
        total = price * quantity;

        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Your total is " + currency + total);

        scanner.close();

    }

    // [Method to Print Separator]
    public static void printSeparator() {
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
    }

}