import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day11v1 {

    final static int HOURGLASSES = 16;

    static void print2DArr(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

    static int[][] getHourGlass(int[][] arr) {
        int[][] HG = new int[3][3];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                HG[i][j] = arr[i][j];
            }
        }

        HG[1][0] = 0;
        HG[1][2] = 0;

        return HG;
    }

    static int getSumHourGlass(int[][] arr) {
        int[][] HG = new int[3][3];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                HG[i][j] = arr[i][j];
            }
        }

        HG[1][0] = 0;
        HG[1][2] = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += HG[i][j];
            }
        }

        return sum;
    }

    static ArrayList<Integer> listValues(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                list.add(arr[i][j]);
            }
        }
        return list;
    }

    /*static int getHighestSum(ArrayList list) {
        int sum = 0;
        int tempSum = 0;

        for (int i = 0; i < HOURGLASSES - 1; i++) {
            for (int j = 0; j < 3; j++) {

            }
        }
    }*/

    static void getAllHourGlass(int[][] arr) {
        int[] sums = new int[16];
        int[][] HG = new int[3][3];
        int sum = 0;

        for (int hg = 0; hg < 15; hg++) {
            int reminder = hg % 4;
            int i = 0;

            switch (reminder) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
            }

            System.out.println("Save and display hourglass:");
            for (; i < 3 + i; i++) {
                for (int j = 0; j < 3; j++) {
                    HG[i%3][j] = arr[i][j];
                    System.out.print(HG[i%3][j]);
                }
                System.out.println();
                if(i>=2) break;
            }


            HG[1][0] = 0;
            HG[1][2] = 0;


            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < 3; j++) {
                    sum += HG[k][j];
                }
            }

            System.out.println("Display sum of hg values: " + sum);

            sums[hg] = sum;

            sum = 0;

        }

        System.out.println(Arrays.toString(sums));
    }

    static int[] hourGlassSumArr(int[][] arr) {
        int[] hourGlassSumArr = new int[HOURGLASSES];

        return hourGlassSumArr;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        System.out.println("Display input:\n");
        print2DArr(arr);

        System.out.println("Display input as list:");
        getAllHourGlass(arr);
    }
}
