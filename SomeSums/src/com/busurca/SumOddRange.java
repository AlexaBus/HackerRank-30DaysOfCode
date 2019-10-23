package com.busurca;

public class SumOddRange {

    public static boolean isOdd(int number) {

        if(number > 0 && number % 2 !=0) {
            return true;
        }

        return false;

    }

    public static int sumOfOdd(int start, int end) {

        int sumOfOdd = 0;

        if(start < 0 || end < 0 || start > end) {
            sumOfOdd = -1;
        } else {

            for (int i = start; i<=end; i++) {
                if(isOdd(i)) {
                    sumOfOdd += i;
                }
            }
        }
        return sumOfOdd;

    }

}
