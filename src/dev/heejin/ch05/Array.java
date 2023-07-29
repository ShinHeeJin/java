package dev.heejin.ch05;

import java.util.Arrays;

public class Array {

    public static void printArray(int[] array){
        for (int i : array) {
            System.out.print(i);
        }
    }
    public static void main() {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        Array.printArray(arr);
        System.out.println();

        int[] arr2 = {1, 2, 3, 4, 5}; // new int[] 생략가능
        Array.printArray(arr);
        System.out.println();

        String s = Arrays.toString(arr);
        System.out.println("s = " + s);

    }
}
