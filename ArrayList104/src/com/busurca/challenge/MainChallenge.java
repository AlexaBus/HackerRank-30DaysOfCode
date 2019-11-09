package com.busurca.challenge;

import java.util.Scanner;

public class MainChallenge {

    static Scanner scanner = new Scanner(System.in);
    static MobilePhone mobilePhone = new MobilePhone();

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
                    listContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }


    }

    static void printInstructions() {

        System.out.println("\nPress: ");
        System.out.println("\t 0 - To print choice options ");
        System.out.println("\t 1 - To see the contacts");
        System.out.println("\t 2 - To add a new contact");
        System.out.println("\t 3 - To modify an existing contact");
        System.out.println("\t 4 - To remove a contact");
        System.out.println("\t 5 - To search for a contact");
        System.out.println("\t 6 - To quit the application");

    }

    private static void listContacts() {
        System.out.println("Contacts");
        for (Contacts contact : mobilePhone.getContacts()) {
            System.out.println(contact);
        }
    }

    private static void addContact() {
        System.out.print("Please enter the name of the new contact: ");
        String contactName = scanner.nextLine();
        System.out.println("Please enter the phone number of the new contact");
        String phoneNumber = scanner.nextLine();
        mobilePhone.addContact(contactName, phoneNumber);
        System.out.println("Contact " + contactName + " with phone number " + phoneNumber + " has been added!");
    }

    private static void modifyContact() {

        System.out.println("Enter the name of the contact to modify:");
        String contactToModify = scanner.nextLine();
        String option = null;
        if (!mobilePhone.searchContact(contactToModify)) {
            System.out.println("Contact does not exist! Choose option:");
        } else {
            System.out.println("Type the new name or the new phone number to update your contact");
            option = scanner.nextLine();
            if (!option.startsWith("0") && !option.startsWith("+")) {
                System.out.println();
                mobilePhone.modifyContactName(contactToModify, option);
                System.out.println("The contact has been modified! The new details are " + mobilePhone.getContactByName(contactToModify));
            } else {
                System.out.println();
                mobilePhone.modifyContactNumber(contactToModify, option);
                System.out.println("The contact has been modified! The new details are " + mobilePhone.getContactByName(contactToModify));
            }
        }
        printInstructions();
    }

    private static void removeContact() {

        System.out.println("Enter the name of the contact to remove:");
        String contactToRemove = scanner.nextLine();
        if (!mobilePhone.searchContact(contactToRemove)) {
            System.out.println("Contact does not exist! Choose option:");
        } else {
            Contacts contact = mobilePhone.getContactByName(contactToRemove);
            mobilePhone.removeContact(contactToRemove);
            System.out.println(contact.toString() + " has been removed");
        }
        printInstructions();

    }

    private static void searchContact() {

        System.out.println("Enter a name or a number to search for:");
        String contactToSearchFor = scanner.nextLine();
        if (mobilePhone.getContactByName(contactToSearchFor) == null && mobilePhone.getContactByNumber(contactToSearchFor) == null) {
            System.out.println("Contact does not exist! Choose option:");
        } else {
            Contacts contact;

            if (mobilePhone.getContactByName(contactToSearchFor) != null) {
                contact = mobilePhone.getContactByName(contactToSearchFor);
            } else {
                contact = mobilePhone.getContactByNumber(contactToSearchFor);
            }

            System.out.println(contact.toString());

        }
        printInstructions();

    }

}
