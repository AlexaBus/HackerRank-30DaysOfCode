package com.busurca;

public class Main {

    public static void main(String[] args) {

//        int newScore = calculateScore("Alex", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(74);
//        calculateScore();
//
//        System.out.println(Challenge.calcFeetAndInchesToCentimeters(157));
//
//        System.out.println(SecondsAndMinutesChallenge.getDurationString(-1159));

//        System.out.println(AreaCalculator.area(5.0));

        //MinutesToYearsDaysCalculator.printYearsAndDays(-561600);

        //IntEqualityPrinter.printEqual(1,2,3);

        boolean isCatPlaying = PlayingCat.isCatPlaying(false,24);
        System.out.println(isCatPlaying);

    }



    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;

    }

    public static int calculateScore(int score) {

        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;

    }

    public static int calculateScore() {

        System.out.println("No player name, no player score");
        return 0;

    }
}
