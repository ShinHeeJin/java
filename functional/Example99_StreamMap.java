package functional;

import java.util.Arrays;
import java.util.List;

// Stream map 학습

public class Example99_StreamMap {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("=== map으로 2배 ===");
        numbers.stream()
               .map(n -> n * 2)
               .forEach(System.out::println);

        System.out.println("\n=== 문자열 길이 계산 ===");
        List<String> words = Arrays.asList("hello", "world", "java");
        words.stream()
             .map(String::length)
             .forEach(System.out::println);

        System.out.println("\n=== filter와 map 조합 ===");
        numbers.stream()
               .filter(n -> n > 2)
               .map(n -> n * 10)
               .forEach(System.out::println);
    }
}
