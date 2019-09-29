package com.busurca;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void printMinMaxNumbers() {

        Scanner s = new Scanner(System.in);


        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        while (true) {

            System.out.println("Enter number:");

            boolean itHasInt = s.hasNextInt();

            if (itHasInt) {
                int enteredNumber = s.nextInt();
                if (enteredNumber > maxValue) {
                    maxValue = enteredNumber;
                }
                if (enteredNumber < minValue) {
                    minValue = enteredNumber;
                }
            } else {
                break;
            }
            s.nextLine(); //handle end of line(enter key)
        }

        System.out.println("Invalid value. Min value entered was: " + minValue + " and max value entered was: " + maxValue);

        s.close();

    }

}
