package com.busurca;

import java.util.Scanner;

public class Challenge {


    /********************************
     * My solution to Tim's challenge
     *******************************/

    public static void sum() {

        Scanner s = new Scanner(System.in);

        int countValidInputs = 1, sumOfValidInputs = 0;
        boolean hasNextInt;

        while (countValidInputs <= 10) {

            System.out.println("Enter number #" + countValidInputs);
            hasNextInt = s.hasNextInt();
            if (hasNextInt) {
                sumOfValidInputs += s.nextInt();
                countValidInputs++;
            } else {
                System.out.println("Invalid Number");
            }
            s.nextLine();
        }

        System.out.println("The sum of the numbers entered is " + sumOfValidInputs);
        s.close();


    }

}
