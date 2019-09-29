package com.busurca;

public class SharedDigit {

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {

        if(numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo > 99) {
            return false;
        }

        int digitOneTwo = numberOne % 10;
        int digitOneOne = numberOne / 10;
        int digitTwoTwo = numberTwo % 10;
        int digitTwoOne = numberTwo / 10;

        return (digitOneOne == digitTwoOne) || (digitOneOne == digitTwoTwo) || (digitOneTwo == digitTwoTwo) || (digitOneTwo == digitTwoOne);

    }

}
