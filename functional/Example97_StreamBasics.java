package functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Stream 기초 학습

public class Example97_StreamBasics {
    public static void main(String[] args) {
        System.out.println("=== Stream 생성 ===");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("=== 기본 스트림 ===");
        Stream<Integer> stream = numbers.stream();

        System.out.println("\n=== forEach (각 요소 처리) ===");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.println("\n=== map (변환) ===");
        numbers.stream()
               .map(n -> n * 2)
               .forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.println("\n=== filter (필터링) ===");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.println("\n=== collect (수집) ===");
        List<Integer> evens = numbers.stream()
                                     .filter(n -> n % 2 == 0)
                                     .toList();
        System.out.println("짝수: " + evens);

        System.out.println("\n=== count ===");
        long count = numbers.stream()
                           .filter(n -> n > 2)
                           .count();
        System.out.println("2보다 큰 숫자: " + count);

        System.out.println("\n=== reduce (축약) ===");
        int sum = numbers.stream()
                        .reduce(0, (a, b) -> a + b);
        System.out.println("합계: " + sum);
    }
}
