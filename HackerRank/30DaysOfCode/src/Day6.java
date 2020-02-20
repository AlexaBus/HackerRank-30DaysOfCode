import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {
        //create object to read input from user
        Scanner userInput = new Scanner(System.in);

        //read first line that gives the number of test cases and create an of that size
        System.out.println("Enter array length:");
        int arrayLength = userInput.nextInt();
        String[] givenStrings = new String[arrayLength];
        System.out.println("Array length:" + givenStrings.length);
        userInput.nextLine();

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("i = " + i);
            givenStrings[i] = userInput.nextLine();
            System.out.println(givenStrings[i]);
        }

        userInput.close();

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("i = " + i + " and input was: " + givenStrings[i]);
        }

        for (int i = 0; i < givenStrings.length; i++) {
            for (int j = 0; j < givenStrings[i].length(); j += 2) {
                System.out.print(givenStrings[i].charAt(j));
            }

            System.out.print(" ");

            for (int k = 1; k < givenStrings[i].length(); k += 2) {
                System.out.print(givenStrings[i].charAt(k));
            }

            System.out.println();
        }
    }

}
