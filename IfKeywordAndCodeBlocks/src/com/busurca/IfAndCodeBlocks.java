package com.busurca;

public class IfAndCodeBlocks {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score>1000) {
//            System.out.println("Your score is between 1000 and 5000");
//        }
//        else if (score < 1000) {
//            System.out.println("Your score is less than 1000");
//        }
//        else {
//            System.out.println("Got here");
//        }

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
            /*
            challenge
             */

            //my solution
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int secondFinalScore = score + (levelCompleted * bonus);
            System.out.println("Second final score is " + secondFinalScore);
            //my solution
        }

        //tim's solution is to duplicate code outside of the if statement
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Second final score is " + finalScore);
        }




    }
}
