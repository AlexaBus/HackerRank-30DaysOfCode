package com.busurca;

public class NumberToWords {

    public static void numberToWords(int number) {


        if(number < 0) {
            System.out.println("Invalid Value");
        } else if(number == 0){
            System.out.println("Zero");
        } else {
            int reversedNumber = reverse(number);
            while(reversedNumber > 0) {

                int lastDigit = reversedNumber % 10;

                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }

                reversedNumber = reversedNumber / 10;

            }

            if(getDigitCount(number) > getDigitCount(reversedNumber)) {
                int requiredZeroes = getDigitCount(number) - getDigitCount(reverse(number));
                for (int i = 0; i < requiredZeroes ; i++) {
                    System.out.println("Zero");
                }
            }
        }

    }

    public static int reverse(int number) {

        int originalNumber = number;
        int reversedNumber = 0;

        while(Math.abs(number) > 0) {
            int currentDigit = Math.abs(number) % 10;
            reversedNumber = reversedNumber * 10 + currentDigit;
            number = number / 10;
        }

        if(originalNumber < 0) {
            return -reversedNumber;
        } else {
            return reversedNumber;
        }

    }



    public static int getDigitCount(int number) {

        if(number < 0) return -1;

        if(number == 0) {
            return 1;
        }

        int count = 0;

        while(number > 0) {
            count++;
            number = number / 10;
        }

        return count;

    }

}
