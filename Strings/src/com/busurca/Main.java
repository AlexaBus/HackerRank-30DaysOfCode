package com.busurca;

public class Main {

    public static void main(String[] args) {

        /*primitive data types
        byte - 1 byte width 8
        short - 2 bytes width 16
        int - 4 bytes width 32
        long - 8 bytes width 64
        float - 2 bytes width 16
        double - 4 bytes width 32
        char
        boolean
         */

        String myString = "My string";
        System.out.println(myString);
        myString = myString + ". Added later";
        System.out.println(myString);
        myString = myString + " \u00A9 and \u00AE 2019";
        System.out.println(myString);

        String number = "250.55";
        number = number + "49.45";
        System.out.println(number);

        String string = "10";
        int integer = 50;
        double number2 = 100.27;
        String numbersAddedToString = string + integer + number2;
        System.out.println("A number, be it integer or decimal, \nadded to a string will actually \nbe concatenated to it: " + numbersAddedToString);

    }
}
