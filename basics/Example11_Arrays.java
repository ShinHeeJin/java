package basics;

import java.util.Arrays;

// 배열 학습
// 배열 선언, 초기화, 접근

public class Example11_Arrays {
    public static void main(String[] args) {
        System.out.println("=== 배열 선언 및 초기화 ===");
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("배열: " + Arrays.toString(numbers));

        System.out.println("\n=== 배열 접근 ===");
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[2] = " + numbers[2]);
        System.out.println("numbers[4] = " + numbers[4]);

        System.out.println("\n=== 배열 길이 ===");
        System.out.println("배열의 길이: " + numbers.length);

        System.out.println("\n=== 배열 수정 ===");
        numbers[2] = 35;
        System.out.println("수정 후: " + Arrays.toString(numbers));

        System.out.println("\n=== 배열 생성 (크기만 지정) ===");
        String[] fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        System.out.println("과일: " + Arrays.toString(fruits));

        System.out.println("\n=== 배열 순회 ===");
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("합계: " + sum);

        System.out.println("\n=== 배열 정렬 ===");
        int[] unsorted = {50, 20, 40, 10, 30};
        Arrays.sort(unsorted);
        System.out.println("정렬 후: " + Arrays.toString(unsorted));

        System.out.println("\n=== 배열 복사 ===");
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, original.length);
        copy[0] = 99;
        System.out.println("원본: " + Arrays.toString(original));
        System.out.println("복사본: " + Arrays.toString(copy));

        System.out.println("\n=== 배열에서 특정 값 찾기 ===");
        int[] data = {15, 25, 35, 45, 55};
        Arrays.sort(data);
        int index = Arrays.binarySearch(data, 35);
        System.out.println("35의 인덱스: " + index);

        System.out.println("\n=== 배열 채우기 ===");
        int[] filled = new int[5];
        Arrays.fill(filled, 10);
        System.out.println("채워진 배열: " + Arrays.toString(filled));

        System.out.println("\n=== 배열 비교 ===");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};
        System.out.println("arr1과 arr2 같은가? " + Arrays.equals(arr1, arr2));
        System.out.println("arr1과 arr3 같은가? " + Arrays.equals(arr1, arr3));
    }
}
