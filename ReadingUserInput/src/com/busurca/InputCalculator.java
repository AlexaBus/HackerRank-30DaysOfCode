package com.busurca;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scan = new Scanner(System.in);

        int countInputs = 0, sum = 0, avg = 0;
        boolean hasInt;


        while (true) {

            hasInt = scan.hasNextInt();

            if (hasInt) {
                countInputs++;
                sum += scan.nextInt();
                avg = (int) (Math.round((double) sum / (double) countInputs));
            } else {
                break;
            }

            scan.nextLine();//handle pressing enter
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scan.close();
    }

}
