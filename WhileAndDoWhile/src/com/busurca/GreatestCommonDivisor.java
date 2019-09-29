package com.busurca;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int numberOne, int numberTwo) {

        if(numberOne < 10 || numberTwo < 10) { return -1;}

        int smallestNumber = Math.min(numberOne, numberTwo);
        int greatestDivisor = 1;

        for (int divisor = smallestNumber; divisor >0; divisor--) {
                int numberOneRemainder = numberOne % divisor;
                int numberTwoRemainder = numberTwo % divisor;

                if(numberOneRemainder == 0 && numberTwoRemainder == 0) {
                    greatestDivisor = divisor;
                    break;
                }

        }
        return greatestDivisor;

    }

}
