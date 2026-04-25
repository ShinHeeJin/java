package generics;

// 제네릭 메서드 학습

public class Example82_GenericMethod {
    // 제네릭 메서드
    public static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }

    // 제네릭 메서드: 반환값 있음
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];
        for (T item : arr) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    // 제네릭 메서드: 두 개의 타입
    public static <K, V> void print(K key, V value) {
        System.out.println(key + " -> " + value);
    }

    public static void main(String[] args) {
        System.out.println("=== 제네릭 메서드 ===");

        System.out.println("=== String 배열 ===");
        String[] strings = {"Apple", "Banana", "Cherry"};
        printArray(strings);

        System.out.println("\n=== Integer 배열 ===");
        Integer[] integers = {5, 2, 8, 1};
        printArray(integers);

        System.out.println("\n=== 최대값 찾기 ===");
        Integer max = findMax(integers);
        System.out.println("최대값: " + max);

        System.out.println("\n=== 두 개의 타입 ===");
        print("Name", "Kim");
        print(100, 3.14);
    }
}
