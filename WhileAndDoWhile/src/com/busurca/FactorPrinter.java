package com.busurca;

public class FactorPrinter {

    public static void printFactors(int number) {

        if(number < 1) {
            System.out.println("Invalid Value");
        } else {

            String factor = String.valueOf(number);
            int currentFactor = number;

            for (int i = number - 1; i > 0; i--) {

                if (number % i == 0) {
                    currentFactor = i;
                    factor = currentFactor + " " + factor;
                }

            }

            System.out.println(factor);
        }

    }

}
