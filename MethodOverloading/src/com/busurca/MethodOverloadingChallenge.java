package com.busurca;

public class MethodOverloadingChallenge {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if((feet < 0) || (inches < 0) || (inches > 12)) return -1;

        return ((feet * 12) + inches) * 2.54;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) return -1;

        double feet = (int) (inches /12);
        double inchesLeft =  inches % 12;

        return calcFeetAndInchesToCentimeters(feet, inchesLeft);

    }

}
