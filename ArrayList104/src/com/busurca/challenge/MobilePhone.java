package com.busurca.challenge;

import java.util.ArrayList;
import java.util.List;

class MobilePhone {

    //local list that will hold the contacts
    private List<Contacts> contacts = new ArrayList<>();

    //getter for all contacts
    List<Contacts> getContacts() {
        return contacts;
    }

    //method to add a contact
    void addContact(String name, String phoneNumber) {
        //create a new contact object
        Contacts contact = new Contacts(name, phoneNumber);
        //store it in the list
        contacts.add(contact);
    }

    //method to check if a contact is in the list by its name
    boolean searchContact(String name) {

        for (Contacts contact : contacts
        ) {
            if (contact.getName().toLowerCase().contains(name.toLowerCase()))
                return true;
        }

        return false;
    }


    //method to get contact by name
    Contacts getContactByName(String name) {

        Contacts contact = null;

        for (Contacts c : contacts) {
            String contactName = c.getName().toLowerCase();
            if (contactName.contains(name)) {
                contact = c;
            }

        }

        return contact;
    }

    //return all contacts matching the search
    ArrayList<Contacts> contactsMatchingSearch(String name) {

        ArrayList<Contacts> searchResult = new ArrayList<>();
        for (Contacts contact : contacts
        ) {
            if (contact.getName().toLowerCase().contains(name.toLowerCase())) {
                searchResult.add(contact);
            }
        }
        return searchResult;
    }


    boolean modifyContact(String nameOfContactToModify, String newName) {

        Contacts contactToModify = getContactByName(nameOfContactToModify);
        if (contactToModify != null) {
            contactToModify.setName(newName);
            return true;
        }

        return false;

    }
}
