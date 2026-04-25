package functional;

import java.util.Arrays;
import java.util.List;

// 병렬 Stream 학습

public class Example104_ParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("=== 순차 Stream ===");
        long start = System.currentTimeMillis();
        long count = numbers.stream()
                           .filter(n -> n > 5)
                           .count();
        long sequential = System.currentTimeMillis() - start;
        System.out.println("개수: " + count);
        System.out.println("시간: " + sequential + "ms");

        System.out.println("\n=== 병렬 Stream ===");
        start = System.currentTimeMillis();
        long parallelCount = numbers.parallelStream()
                                    .filter(n -> n > 5)
                                    .count();
        long parallel = System.currentTimeMillis() - start;
        System.out.println("개수: " + parallelCount);
        System.out.println("시간: " + parallel + "ms");

        System.out.println("\n=== parallel() 메서드 ===");
        numbers.stream()
               .parallel()
               .filter(n -> n > 5)
               .forEach(System.out::println);
    }
}
