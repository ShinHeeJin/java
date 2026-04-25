package functional;

import java.util.Arrays;
import java.util.List;

// Stream filter 학습

public class Example98_StreamFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("=== filter로 짝수만 ===");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

        System.out.println("\n=== filter로 5보다 큼 ===");
        numbers.stream()
               .filter(n -> n > 5)
               .forEach(System.out::println);

        System.out.println("\n=== 여러 filter 체이닝 ===");
        numbers.stream()
               .filter(n -> n > 3)
               .filter(n -> n < 8)
               .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
