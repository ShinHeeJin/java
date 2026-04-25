package functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Predicate 함수형 인터페이스 학습

public class Example93_Predicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("=== Predicate: 짝수 ===");
        Predicate<Integer> isEven = n -> n % 2 == 0;
        numbers.stream()
               .filter(isEven)
               .forEach(System.out::println);

        System.out.println("\n=== Predicate: 5보다 큼 ===");
        Predicate<Integer> greaterThan5 = n -> n > 5;
        numbers.stream()
               .filter(greaterThan5)
               .forEach(System.out::println);

        System.out.println("\n=== Predicate 조합 (and) ===");
        Predicate<Integer> combined = isEven.and(greaterThan5);
        numbers.stream()
               .filter(combined)
               .forEach(System.out::println);
    }
}
