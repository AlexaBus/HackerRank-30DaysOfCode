package com.busurca;

public class Main {

    public static void main(String[] args) {

        NumberInWord.printNumberInWord(4);

        DayOfTheWeekChallenge.printDayOfTheWeek(0);
        DayOfTheWeekChallenge.printDayOfTheWeekIf(0);


        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4 or a 5");
                System.out.println("Actually it was " + switchValue);
                break;

            default:
                System.out.println("Was not 1,2,3,4 or 5");
                System.out.println("It was " + switchValue);
                break;
        }

        char letter = 'E';

        switch(letter) {
            case 'A':
                System.out.println("It was A");
                break;

            case 'B':
                System.out.println("It was B");
                break;

            case 'C':
                System.out.println("It was C");
                break;

            case 'D':
                System.out.println("It was D");
                break;

            case 'E':
                System.out.println("It was E");
                break;

            default:
                System.out.println("Was not A, B, C, D, E");
                break;
        }



    }
}
