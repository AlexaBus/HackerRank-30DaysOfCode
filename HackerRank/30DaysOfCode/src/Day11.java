import java.util.ArrayList;
import java.util.Scanner;

public class Day11 {

    final static int HOURGLASSES = 16;

    static int getHourGlass(int[][] arr, int hg) {
        ArrayList<Integer> HG = new ArrayList<>();
        int i = 0;
        int lessThen = 3;
        int sum = 0;

        /*if (hg == 4 || hg == 5 || hg == 6 || hg == 7) {
            i = 1;
            lessThen += i;
        } else if (hg == 8 || hg == 9 || hg == 10 || hg == 11) {
            i = 2;
            lessThen += i;
        } else if (hg == 12 || hg == 13 || hg == 14 || hg == 15) {
            i = 3;
            lessThen += i;
        }*/

        int reminder = hg % 4;

        if (hg > 0 && reminder == 0) {
            i++;
            lessThen += i;
        }

        for (; i < lessThen; i++) {
            for (int j = reminder; j < 3 + reminder; j++) {
                HG.add(arr[i][j]);
            }
        }


        HG.set(3, 0);
        HG.set(5, 0);

        for (int j = 0; j < HG.size(); j++) {
            sum += HG.get(j);
        }

        System.out.println(hg + "; i is " + i + "; values: " + HG + "; sum: " + sum);

        return sum;
    }

    static int returnGreatestSum(int[][] arr) {
        int sum = getHourGlass(arr, 0);

        for (int i = 1; i < HOURGLASSES; i++) {
            if (getHourGlass(arr, i) > sum) {
                sum = getHourGlass(arr, i);
            }
        }
        return sum;
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

        System.out.println(returnGreatestSum(arr));


    }
}
