package com.busurca;

public class Main {

    public static void main(String[] args) {
        ArrayChallenge arrayChallenge = new ArrayChallenge();

        int[] array = arrayChallenge.getArrayFromInput(7);
        int[] sortedArray = arrayChallenge.sortArray(array);
        arrayChallenge.printArray(sortedArray);

    }


}
