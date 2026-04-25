package functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// 터미널 연산 학습

public class Example105_TerminalOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("=== count ===");
        long count = numbers.stream().count();
        System.out.println("개수: " + count);

        System.out.println("\n=== sum (reduce) ===");
        int sum = numbers.stream()
                        .reduce(0, Integer::sum);
        System.out.println("합계: " + sum);

        System.out.println("\n=== findFirst ===");
        Optional<Integer> first = numbers.stream()
                                        .filter(n -> n > 2)
                                        .findFirst();
        System.out.println("첫 번째: " + first.orElse(-1));

        System.out.println("\n=== anyMatch/allMatch/noneMatch ===");
        System.out.println("2보다 큰 수 있는가?: " + numbers.stream().anyMatch(n -> n > 2));
        System.out.println("모두 양수인가?: " + numbers.stream().allMatch(n -> n > 0));
        System.out.println("음수가 없는가?: " + numbers.stream().noneMatch(n -> n < 0));

        System.out.println("\n=== max/min ===");
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println("최대값: " + max.orElse(-1));
        System.out.println("최소값: " + min.orElse(-1));
    }
}
