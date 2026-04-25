package functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Consumer 함수형 인터페이스 학습

public class Example95_Consumer {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("=== Consumer: 출력 ===");
        Consumer<Integer> printer = n -> System.out.println(n);
        numbers.forEach(printer);

        System.out.println("\n=== Consumer: 누적 합계 ===");
        numbers.forEach(new Consumer<Integer>() {
            int sum = 0;
            @Override
            public void accept(Integer n) {
                sum += n;
                System.out.println("누적 합: " + sum);
            }
        });

        System.out.println("\n=== Consumer 조합 ===");
        Consumer<String> print = System.out::println;
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        List<String> words = Arrays.asList("hello", "world");
        words.forEach(print.andThen(printUpperCase));
    }
}
