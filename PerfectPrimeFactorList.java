package HomeWork_Tuan4;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static boolean isPrime(int aPosInt) {
        if (aPosInt < 1) {
            return false;
        }
        for (int i = 2; i * i <= aPosInt; i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int result = 1;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                if (isPrime(i)) {
                    result *= i;
                }
            }
        }
        return (aPosInt == result);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the upper bound: ");
        int upperBound = in.nextInt();
        in.close();

        int count = 0;
        System.out.println(
                "These numbers are equal to the product of prime factors:");
        for (int i = 1; i <= upperBound; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        double percent = ((double) count / (double) upperBound) * 100;
        System.out.printf("\n[%d numbers found (%.2f%%)]", count, percent);
    }
}