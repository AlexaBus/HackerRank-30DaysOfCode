package com.busurca;

public class Main {

    public static void main(String[] args) {

        //width og a char is 16 (2 bytes)
        char myChar = '\u00A9';

        System.out.println("Unicode: " + myChar);

        boolean myBoolean = false;
        boolean imMale = true;

        /*
        challenge
         */

        char registeredTM = '\u00AE';

        System.out.println("Registered TM in JAVA: " + registeredTM);



    }
}
