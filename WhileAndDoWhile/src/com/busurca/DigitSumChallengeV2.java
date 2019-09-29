package com.busurca;

public class DigitSumChallengeV2 {

    public static int sumOfDigits(int number) {

        if(number < 10) return -1;

        int sumOfDigits = 0;
        int lastDigit;
        int newNumber = number;

        do {
            lastDigit = newNumber % 10;
            sumOfDigits += lastDigit;
            newNumber = newNumber /10;
        } while (newNumber >=10);

        return sumOfDigits + newNumber;
    }

}
