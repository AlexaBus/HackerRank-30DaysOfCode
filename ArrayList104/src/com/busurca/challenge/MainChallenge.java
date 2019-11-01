package com.busurca.challenge;

import java.util.Scanner;

public class MainChallenge {

    static Scanner scanner = new Scanner(System.in);
    static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        mobilePhone.addContact("Orfeus Sub", "123456789");
        mobilePhone.addContact("Agora Miu", "234567891");
        mobilePhone.addContact("Flance", "345678912");
        System.out.println(mobilePhone.getContacts().toString());
        System.out.println(mobilePhone.contactsMatchingSearch("Sub"));
        mobilePhone.modifyContact("miu", "Agora Oxi");
        System.out.println(mobilePhone.getContacts().toString());
        mobilePhone.modifyContact("flance", "Flance Bus");
        System.out.println(mobilePhone.getContacts().toString());


    }

    static void printInstructions() {

    }

}
