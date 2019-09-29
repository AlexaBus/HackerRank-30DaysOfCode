package com.busurca;

public class DigitSumChallenge {

    public static int sumDigits(int number) {

        if(number < 10) return -1;

        int sumOfDigits = 0;
        int newNumber = number;
        int lastDigit;

        while (newNumber > 0) {

            lastDigit = newNumber % 10;
            sumOfDigits += lastDigit;
            newNumber = newNumber / 10;

        }

        return sumOfDigits;


    }

}
