package HomeWork_Tuan4;

import java.util.Scanner;

public class FibonacciRecursive {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        in.close();

        System.out.println("F(" + n + ") = " + fibonacci(n));
    }

}
