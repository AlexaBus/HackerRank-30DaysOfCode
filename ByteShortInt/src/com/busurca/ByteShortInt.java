package com.busurca;

public class ByteShortInt {

    public static void main(String[] args) {

        //the int has a width of 32
        int minValue = -2_147_483_648;
        int maxValue = 2_147_483_647;

        System.out.println(minValue + maxValue);

        //the byte has a width of 8
        byte mySmallByteValue = -128;
        byte myLargeByteValue = 127;

        byte divideMySmallValue = (byte) (mySmallByteValue/2);

        System.out.println("My small byte value divided by 2 is " + divideMySmallValue);

        byte canYouHaveALetter = 'a';//seems you can put a char in a byte data type

        //the short has a width of 16
        short mySmallShortValue = -32_768;
        short myLargeShortValue = 32_767;

        //the long has a width of 64
        long mySmallLongValue = -9_223_372_036_854_775_808L;//huge negative number
        long myLargeLongValue = 9_223_372_036_854_775_807L;//huge positive number

        /*
        Tim's challenge
         */

        byte alexsByteValue = 32;
        short alexsShortValue = 27_893;
        int alexsIntValue = 1_281_456;
        long alexsLongValue = 50_000L + 10L * (alexsByteValue + alexsShortValue + alexsIntValue);
        System.out.println("My long value is: " + alexsLongValue);



    }
}
