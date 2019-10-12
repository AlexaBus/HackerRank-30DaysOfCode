package com.busurca;

public class TeenNumberChecker {

    public static boolean isTeen(int age) {

        return age >= 13 && age <= 19;

    }

    public static boolean hasTeen(int one, int two, int three) {

        return isTeen(one) || isTeen(two) || isTeen(three);

    }

}
