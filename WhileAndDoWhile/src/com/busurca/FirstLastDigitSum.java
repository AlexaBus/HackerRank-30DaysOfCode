package com.busurca;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if(number < 0) {
            return -1;
        } else if (number < 10) {
            return number + number;
        }

        int lastDigit = number % 10;
        int firstDigit = 0;

        while (number > 0) {
            number /= 10;

            if(number <10) {
                firstDigit = number;
                break;
            }

        }

        return lastDigit + firstDigit;

    }

}
