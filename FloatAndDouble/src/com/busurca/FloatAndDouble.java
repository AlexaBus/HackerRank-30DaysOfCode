package com.busurca;

public class FloatAndDouble {

    public static void main(String[] args) {

        //int has a width of 32 (4 bytes)
        int myInt = 5/2;

        //float has a width of 32
        float myFloat = 5f/3f;

        //double has a width of 64 (8 bytes)
	    double myDouble = 5d/3d;

        System.out.println("myInt = " + myInt);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDoubl = " + myDouble);

        /*
        challenge
         */

        double myWeightInkilograms = 88.5d;
        double kilogramToPoundRatio = 2.204_622_62d;
        double myWeightInPounds = myWeightInkilograms * kilogramToPoundRatio;
        System.out.println("My weight in pounds is " + myWeightInPounds + " pounds.");

    }
}
