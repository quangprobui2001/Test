package HomeWork_Tuan4;

import java.util.Scanner;

public class InsertionSort {
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

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int mark = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > mark) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
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
        insertionSort(array);
    }

}
