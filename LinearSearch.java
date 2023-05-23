package HomeWork_Tuan4;

import java.util.Scanner;

public class LinearSearch {
    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
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
        System.out.println("Enter the key: ");
        int key = in.nextInt();
        in.close();

        System.out.println(key + " is found inside the array: "
                + linearSearch(array, key));
        System.out.println("The array index of " + key + " is "
                + linearSearchIndex(array, key));
    }

}
