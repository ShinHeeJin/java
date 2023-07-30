package dev.heejin.ch05;

import java.util.Arrays;

public class MultiDimensionArray {

    public static void main() {
        // 2nd Array
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{0, 1}, {2, 3}};
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr2D = " + Arrays.deepToString(arr2D));

        // equals
        int[][] arr2D2 = {{0, 1}, {2, 3}};
        System.out.println(Arrays.equals(arr2D, arr2D2));
        System.out.println(Arrays.deepEquals(arr2D, arr2D2));

        // 복사
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = arr;
        System.out.println("arr = " + arr);
        System.out.println("arr3 = " + arr3);
        System.out.println("arr2 = " + arr2);
        System.out.println("arr == arr2 -> " + (arr == arr2));
        System.out.println("arr == arr3 -> " + (arr == arr3));

        // 정렬
        int[] newArr = {0, 5, 4, 6, 7, 2, 3};
        Arrays.sort(newArr);
        System.out.println("Arrays.toString(newArr) = " + Arrays.toString(newArr));

    }
}
