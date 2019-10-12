package com.busurca;

public class ForLoop {

    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
        }

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
        }
        int countPrimeNumbers = 0;
        for (int i = 100; i < 210; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                countPrimeNumbers++;
            }
            if(countPrimeNumbers == 10) break;
        }

    }

    public static boolean isPrime(int n) {
        if(n == 1){
            return false;
        }
        //square root of a number is faster than the number divided by 2
        for (int i = 2; i <= (long) Math.sqrt(n) ; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}
