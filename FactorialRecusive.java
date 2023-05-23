package HomeWork_Tuan4;

import java.util.Scanner;

public class FactorialRecusive {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        in.close();

        System.out.println("The factorial of " + n + " is " + factorial(n));
    }

}
