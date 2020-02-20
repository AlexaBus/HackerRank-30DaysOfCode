import java.util.Scanner;

class MyException extends Exception {
     MyException() {
        super("n and p should be non-negative");
    }
}

class Calculator {

    int power(int n, int p) throws Exception {

        if (n < 0 || p < 0) {
            throw new MyException();
        } else {
            return (int) Math.pow(n, p);
        }
    }

}

//Write your code here

class Solution5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

