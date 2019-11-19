package com.busurca.timsSolution;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phone) {
        this.name = name;
        this.phoneNumber = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }
}
