package HomeWork_Tuan4;

import java.util.Scanner;

public class BubbleSort {
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

    public static void bubbleSort(int[] array) {
        int len = array.length;
        boolean swapped;
        int count = 0;
        do {
            swapped = false;
            count++;
            System.out.println("Pass " + count);
            System.out.print("Array before sort: ");
            print(array);
            for (int j = 1; j < len; j++) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    swapped = true;
                }
                print(array);
            }
            len = len - 1;
        } while (swapped);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.print("Enter array: ");

        input(array, input);
        bubbleSort(array);

    }
}
