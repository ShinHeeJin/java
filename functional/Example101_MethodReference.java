package functional;

import java.util.Arrays;
import java.util.List;

// 메서드 참조 학습

public class Example101_MethodReference {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);

        System.out.println("=== 메서드 참조 (forEach) ===");
        System.out.println("System.out::println 사용:");
        numbers.forEach(System.out::println);

        System.out.println("\n=== 메서드 참조 (static) ===");
        numbers.stream()
               .map(String::valueOf)
               .forEach(System.out::println);

        System.out.println("\n=== 메서드 참조 (인스턴스) ===");
        List<String> words = Arrays.asList("hello", "world", "java");
        words.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);

        System.out.println("\n=== 메서드 참조 (생성자) ===");
        List<String> fruits = Arrays.asList("apple", "banana");
        fruits.stream()
              .forEach(System.out::println);
    }
}
