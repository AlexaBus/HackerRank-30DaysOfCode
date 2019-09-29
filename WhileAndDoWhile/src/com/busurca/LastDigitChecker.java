package com.busurca;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree) {

        boolean hasSameDigit = false;

        int numberOneLastDigit = numberOne % 10;
        int numberTwoLastDigit = numberTwo % 10;
        int numberThreeLastDigit = numberThree % 10;

        if(!isValid(numberOne) || !isValid(numberTwo) || !isValid(numberThree)) {
            hasSameDigit = false;
        } else if((numberOneLastDigit == numberTwoLastDigit) || (numberOneLastDigit == numberThreeLastDigit) || (numberTwoLastDigit == numberThreeLastDigit)) {
            hasSameDigit = true;
        }

        return hasSameDigit;

    }

    public static boolean isValid(int number) {
        if(number <10 || number > 1000) return false;
        return true;
    }

}
