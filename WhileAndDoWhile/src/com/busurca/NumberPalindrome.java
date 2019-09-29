package com.busurca;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int originalNumber = number;
        int reverseNumber = 0;

        while (Math.abs(number) > 0) {
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number = number / 10;
        }

        return Math.abs(originalNumber) == Math.abs(reverseNumber);

    }

}
