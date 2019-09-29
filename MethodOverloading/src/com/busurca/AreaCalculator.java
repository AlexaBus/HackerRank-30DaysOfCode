package com.busurca;

public class AreaCalculator {

    public static final String INVALID_PARAMETERS_MESSAGE = "Invalid parameters";
    public static final double VALUE_OF_PI = Math.PI;

    public static double area(double radius) {

        if(radius < 0) {
            return -1;
        }

        return Math.pow(radius,2) * VALUE_OF_PI;
    }

    public static double area(double x, double y) {

        if(x < 0 || y < 0) {
            return -1;
        }

        return x * y;
    }

}
