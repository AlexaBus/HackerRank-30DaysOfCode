package com.busurca;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if(number < 0) return -1;

        int sumOfEvenDigits = 0;

        while (number > 0) {

            int currentDigit = number % 10;

            if(currentDigit % 2 == 0) {
                sumOfEvenDigits += currentDigit;
            }

            number /= 10;

        }

        return sumOfEvenDigits;

    }

}
