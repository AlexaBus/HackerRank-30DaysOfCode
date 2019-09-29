package com.busurca;

public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int currentFactor;
        int sumFactors;


        for (int i = number; i > 0; i--) {

            if (number % i == 0) {
                currentFactor = i;
                sumFactors = i;
                for (int j = 2; j <= (long) Math.sqrt(currentFactor); j++) {

                    if (currentFactor % j == 0) {
                        sumFactors += j;
                    }
                }
                if (sumFactors == currentFactor) {
                    return currentFactor;
                }
            }

        }

        return -1;

    }

}
