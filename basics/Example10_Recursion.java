package basics;

// 재귀 학습
// 메서드가 자기 자신을 호출

public class Example10_Recursion {

    // 팩토리얼 계산 (재귀)
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // 피보나치 수열 (재귀)
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 거듭제곱 (재귀)
    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    // 합계 계산 (재귀)
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    // 문자열 역순 출력 (재귀)
    public static void reverseString(String str, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str, index - 1);
    }

    // 배열의 최대값 찾기 (재귀)
    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int max = findMax(arr, index + 1);
        return Math.max(arr[index], max);
    }

    // 이진 탐색 (재귀)
    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, left, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== 팩토리얼 ===");
        System.out.println("5! = " + factorial(5));
        System.out.println("6! = " + factorial(6));

        System.out.println("\n=== 피보나치 수열 ===");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        System.out.println("\n=== 거듭제곱 ===");
        System.out.println("2^5 = " + power(2, 5));
        System.out.println("3^4 = " + power(3, 4));

        System.out.println("\n=== 1부터 n까지의 합 ===");
        System.out.println("sum(10) = " + sum(10));
        System.out.println("sum(100) = " + sum(100));

        System.out.println("\n=== 문자열 역순 ===");
        System.out.print("'Hello' 역순: ");
        reverseString("Hello", 4);
        System.out.println();

        System.out.println("\n=== 배열의 최대값 찾기 (재귀) ===");
        int[] numbers = {15, 3, 42, 8, 29, 5};
        System.out.println("최대값: " + findMax(numbers, 0));

        System.out.println("\n=== 이진 탐색 (재귀) ===");
        int[] sorted = {1, 3, 5, 7, 9, 11, 13, 15};
        System.out.println("7의 위치: " + binarySearch(sorted, 7, 0, sorted.length - 1));
        System.out.println("10의 위치: " + binarySearch(sorted, 10, 0, sorted.length - 1));
    }
}
