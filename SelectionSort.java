package HomeWork_Tuan4;

import java.util.Scanner;

public class SelectionSort {
    public static int[] input(int[] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            int maxIdx = i;
            for (int j = 0; j < i; j++) {
                if (array[j] >= array[maxIdx]) {
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                int tmp = array[maxIdx];
                array[maxIdx] = array[i];
                array[i] = tmp;
            }
            print(array);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.print("Enter array: ");
        input(array, input);

        selectionSort(array);
    }

}
