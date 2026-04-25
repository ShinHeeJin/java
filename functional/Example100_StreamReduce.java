package functional;

import java.util.Arrays;
import java.util.List;

// Stream reduce 학습

public class Example100_StreamReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("=== reduce로 합계 ===");
        int sum = numbers.stream()
                        .reduce(0, (a, b) -> a + b);
        System.out.println("합계: " + sum);

        System.out.println("\n=== reduce로 곱하기 ===");
        int product = numbers.stream()
                            .reduce(1, (a, b) -> a * b);
        System.out.println("곱: " + product);

        System.out.println("\n=== reduce로 최대값 ===");
        int max = numbers.stream()
                        .reduce(Integer.MIN_VALUE, (a, b) -> Math.max(a, b));
        System.out.println("최대값: " + max);

        System.out.println("\n=== reduce로 문자열 연결 ===");
        String result = numbers.stream()
                              .map(String::valueOf)
                              .reduce("", (a, b) -> a + b);
        System.out.println("연결: " + result);
    }
}
