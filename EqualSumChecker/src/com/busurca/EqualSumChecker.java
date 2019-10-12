package com.busurca;

public class EqualSumChecker {

    public static boolean hasEqualSum(int one, int two, int result) {

        boolean hasEqualSum = false;

        int onePlusTwo = one + two;

        if(onePlusTwo == result) {
            hasEqualSum = true;
        }

        return hasEqualSum;

    }

}
