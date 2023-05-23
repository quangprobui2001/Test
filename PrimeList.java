package HomeWork_Tuan4;

import java.util.Scanner;

public class PrimeList {
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the upper bound: ");
        int upperBound = in.nextInt();
        in.close();

        int count = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        double percent = ((double) count / (double) upperBound) * 100;
        System.out.printf("[%d primes found (%.2f%%)]", count, percent);
    }
}