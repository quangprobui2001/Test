package HomeWork_Tuan4;

import java.util.Scanner;

public class LengthOfARunningNumberSequence {
    public static int length(int n) {
        if (n == 1) {
            return 1;
        } else {
            return length(n - 1) + Integer.toString(n).length();
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        in.close();

        System.out.print("S(" + n + ") = ");
        for (int i = 1; i <= n; i++) {
            System.out.print(Integer.toString(i));
        }
        System.out.println(" length is " + length(n));
    }

}
