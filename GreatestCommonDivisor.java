package HomeWork_Tuan4;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();
        in.close();

        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }

}
