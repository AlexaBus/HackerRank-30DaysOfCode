import java.util.Scanner;
import java.util.Stack;

public class Day10 {

    static final Scanner scanner = new Scanner(System.in);
    static Stack<Integer> binary = new Stack<>();

    static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    static Stack<Integer> decimalToBinary(int n) {
        while (n > 0) {
            binary.push(n % 2);
            n /= 2;
        }

        return binary;
    }

    static int countOnes(Stack<Integer> stack) {

        int countOnes = 0;

        while (!stack.empty()) {

            int tempCounterOfOnes = 0;

            for (int i = 0; i < stack.size();i++ ) {
                stack.trimToSize();

                if(stack.elementAt(i) == 0 ){
                    stack.pop();
                    tempCounterOfOnes = 0;
                } else {
                    tempCounterOfOnes++;
                    stack.pop();
                }

                if (tempCounterOfOnes > countOnes) countOnes = tempCounterOfOnes;

            }

        }

        return countOnes;
    }

    public static void main(String[] args) {

        //int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //decimalToBinary(n);
        //System.out.println(countOnes(decimalToBinary(n)));

        System.out.println(isNumeric("1850516090042"));


    }

}
