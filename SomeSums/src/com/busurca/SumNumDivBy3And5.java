package com.busurca;

public class SumNumDivBy3And5 {

    public static void main(String[] args) {

        int sumOfNumDivBy3And5 = 0;
        int countOfNumDivBy3And5 = 0;

        for (int i = 1; i < 1000; i++) {
            if ((i % (3 * 5)) == 0) {
                countOfNumDivBy3And5++;
                System.out.println(i + " is divisible by both 3 and 5!");
                sumOfNumDivBy3And5 += i;
            }
            if (countOfNumDivBy3And5 == 5) break;
        }

        System.out.println("Sum of first 5 numbers divisible by both 3 and 5 is " + sumOfNumDivBy3And5);

    }
}
