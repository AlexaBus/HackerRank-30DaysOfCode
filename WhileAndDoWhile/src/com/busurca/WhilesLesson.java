package com.busurca;

public class WhilesLesson {

    public static void main(String[] args) {

        /***********************
         * Testing other classes
         ***********************/

        NumberToWords.numberToWords(1010);


        /*********************************************
        //what Tim showed when explaining the concepts
         ********************************************/
//        int count = 0;
//        while(count != 6) {
//            System.out.println("Count in while is " + count);
//            count++;
//        }
//
//        for (count =0; count != 6; count++) {
//            System.out.println("Count in for is " + count);
//        }
//
//        count = 0;
//        do {
//            System.out.println("Count in do while is " + count);
//            count++;
//        } while (count != 6);

        /*******************
            //Exercise counting even numbers in a given range
         *******************/
//        System.out.println(isEven(6));

//        int start = 4;
//        int end = 20;
//        int count = 0;
//
//        while (start <= end) {
//            start++;
//            if(!isNumberEven(start)) continue;
//
//            count++;
//            System.out.println(start);
//
//            if(count == 5) break;
//
//        }
//
//        System.out.println(count);

    }

        public static boolean isNumberEven(int number) {

        if(number % 2 == 0) {
            return true;
        }

        return false;

    }
}
