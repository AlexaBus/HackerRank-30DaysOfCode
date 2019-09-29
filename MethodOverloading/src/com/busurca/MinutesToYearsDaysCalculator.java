package com.busurca;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if(minutes < 0) {
            System.out.println("Invalid value");
        } else {

            long hours = (int) (minutes / 60);

            long days = (int) (hours / 24);

            long daysLeft = days % 365;

            long years = (int) (days / 365);

            System.out.println(minutes + " min = " + years + " y and " + daysLeft + " d");
        }

    }

}
