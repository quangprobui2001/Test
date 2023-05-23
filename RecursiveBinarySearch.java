package HomeWork_Tuan4;

import java.util.Scanner;
import java.util.Arrays;

public class RecursiveBinarySearch {
    public static boolean binarySearch(int[] array, int key, int fromIdx,
            int toIdx) {

        Arrays.sort(array);

        if (fromIdx == toIdx - 1) {
            if (key == array[fromIdx]) {
                return true;
            } else {
                return false;
            }
        } else {
            int midIdx = (fromIdx + toIdx) / 2;
            if (key == array[midIdx]) {
                return true;
            } else if (key < array[midIdx]) {
                toIdx = midIdx;
            } else {
                fromIdx = midIdx + 1;
            }
            return binarySearch(array, key, fromIdx, toIdx);
        }
    }

    public static int[] input(int[] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.print("Enter array: ");
        input(array, in);
        System.out.print("Enter the key: ");
        int key = in.nextInt();
        System.out.print("From index: ");
        int from = in.nextInt();
        System.out.print("To index: ");
        int to = in.nextInt();
        in.close();

        System.out.println(key + " is found from " + from + " to " + to
                + " in the array: " + binarySearch(array, key, from, to));

    }

}
