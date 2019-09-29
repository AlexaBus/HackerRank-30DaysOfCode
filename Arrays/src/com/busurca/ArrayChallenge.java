package com.busurca;

import java.util.Scanner;

public class ArrayChallenge {

    public int[] getArrayFromInput(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + number + " integer values.\r");

        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();
        return array;

    }

    public int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];

        for (int j = 0; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && sortedArray[i] < key) {
                sortedArray[i + 1] = sortedArray[i];
                i = i - 1;
            }
            sortedArray[i + 1] = key;
        }

        return sortedArray;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println("Array element " + i + " is " + array[i]);
        }
    }

}
