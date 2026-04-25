package functional;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;

// Stream collect 학습

public class Example103_StreamCollect {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("=== toList ===");
        List<Integer> evens = numbers.stream()
                                     .filter(n -> n % 2 == 0)
                                     .collect(Collectors.toList());
        System.out.println("짝수: " + evens);

        System.out.println("\n=== toSet ===");
        Set<Integer> uniqueNumbers = numbers.stream()
                                           .filter(n -> n > 5)
                                           .collect(Collectors.toSet());
        System.out.println("5보다 큰 숫자: " + uniqueNumbers);

        System.out.println("\n=== toMap ===");
        Map<Integer, Integer> squared = numbers.stream()
                                              .limit(5)
                                              .collect(Collectors.toMap(n -> n, n -> n * n));
        System.out.println("제곱: " + squared);

        System.out.println("\n=== joining ===");
        String joined = numbers.stream()
                              .map(String::valueOf)
                              .collect(Collectors.joining(", "));
        System.out.println("연결: " + joined);

        System.out.println("\n=== groupingBy ===");
        Map<Boolean, List<Integer>> grouped = numbers.stream()
                                                    .collect(Collectors.groupingBy(n -> n % 2 == 0));
        System.out.println("짝수/홀수: " + grouped);
    }
}
