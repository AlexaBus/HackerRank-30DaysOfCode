package com.busurca;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if(number < 1) return false;
        int sumOfProperDivisors = 0;

        for (int divisor = number - 1; divisor > 0 ; divisor--) {

            if(number % divisor == 0) {
                sumOfProperDivisors += divisor;
            }

        }

        return sumOfProperDivisors == number;

    }

}
