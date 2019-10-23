package com.busurca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main104 {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArray();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options ");
        System.out.println("\t 1 - To print the items on the list");
        System.out.println("\t 2 - To add a new item to the list");
        System.out.println("\t 3 - To modify an item from the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void printList(){
        groceryList.printGroceryList();
    }

    public static void addItem() {
        System.out.print("Please enter the new grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item to replace: ");
        String itemToReplace = scanner.nextLine();
        if(groceryList.itemExists(itemToReplace)) {
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemToReplace, newItem);}
        else {
            System.out.println(itemToReplace + " does not exist on the list!");
        }
    }

    public static void removeItem() {
        System.out.print("Enter item to remove ");
        String itemToRemove = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemToRemove);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.itemExists(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list!");
        } else {
            System.out.print(searchItem + " is not in the shopping list!");
        }
    }

    private static void processArray() {

        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);

    }

}


