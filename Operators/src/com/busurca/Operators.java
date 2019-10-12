package com.busurca;

public class Operators {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;

        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if(isAlien == true)
            System.out.println("It isn't alien.");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less then 100");

        if ((topScore>90) || (secondTopScore<=90))
            System.out.println("One of these tests is true!");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true.");

        boolean isCar = false;
        if(isCar)
            System.out.println("This shouldn't happen!");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("It was a car");

        /*
        challenge
         */
        System.out.println("\n\nChallenge starts below: ");
        double numberOne = 20;
        double numberTwo = 80;
        double thisResult = (numberOne + numberTwo) * 25;
        double reminder = thisResult % 40;
        if(reminder<=20)
            System.out.println("Total was over the limit!");



    }
}
