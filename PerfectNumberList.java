package HomeWork_Tuan4;

import java.util.Scanner;

public class PerfectNumberList {
    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return (aPosInt == sum);
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return (aPosInt > sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the upper bound: ");
        int upperBound = in.nextInt();
        in.close();

        // List all the perfect numbers
        int countPerfect = 0;
        System.out.println("These numbers are perfect: ");
        for (int i = 1; i <= upperBound; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                countPerfect++;
            }
        }
        double percentPerfect = ((double) countPerfect / (double) upperBound) * 100;
        System.out.printf("\n[%d perfect numbers found (%.2f%%)]", countPerfect,
                percentPerfect);

        // List all the numbers that are neither deficient nor perfect
        int count = 0;
        System.out.println("\nThese numbers are neither deficient nor perfect: ");
        for (int i = 1; i <= upperBound; i++) {
            if (!(isPerfect(i) || isDeficient(i))) {
                System.out.print(i + " ");
                count++;
            }
        }
        double percent = ((double) count / (double) upperBound) * 100;
        System.out.printf("\n[%d numbers found (%.2f%%)]", count, percent);
    }

}
